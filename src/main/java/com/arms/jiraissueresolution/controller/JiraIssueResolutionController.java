/*
 * @author Dongmin.lee
 * @since 2023-03-26
 * @version 23.03.26
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package com.arms.jiraissueresolution.controller;

import com.egovframework.javaservice.treeframework.controller.TreeAbstractController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

import com.arms.jiraissueresolution.model.JiraIssueResolutionEntity;
import com.arms.jiraissueresolution.service.JiraIssueResolution;

@Slf4j
@Controller
@RequestMapping(value = {"/arms/jiraIssueResolution"})
public class JiraIssueResolutionController extends TreeAbstractController<JiraIssueResolution, JiraIssueResolutionEntity> {

    @Autowired
    @Qualifier("jiraIssueResolution")
    private JiraIssueResolution jiraIssueResolution;

    @PostConstruct
    public void initialize() {
        setTreeService(jiraIssueResolution);
    }

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

}
