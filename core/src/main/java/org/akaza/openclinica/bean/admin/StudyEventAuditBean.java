/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.admin;

import org.akaza.openclinica.bean.core.SubjectEventStatus;
import org.akaza.openclinica.bean.login.UserAccountBean;
import org.akaza.openclinica.bean.managestudy.StudyEventDefinitionBean;

/**
 * @author Jun Xu
 *
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class StudyEventAuditBean {
    private StudyEventDefinitionBean definition;
    private SubjectEventStatus oldSubjectEventStatus;
    private SubjectEventStatus newSubjectEventStatus;
    private AuditEventBean auditEvent;
    private UserAccountBean updater;

    /**
     * @return Returns the newSubjectEventStatus.
     */
    public SubjectEventStatus getNewSubjectEventStatus() {
        return newSubjectEventStatus;
    }

    /**
     * @param newSubjectEventStatus
     *            The newSubjectEventStatus to set.
     */
    public void setNewSubjectEventStatus(SubjectEventStatus newSubjectEventStatus) {
        this.newSubjectEventStatus = newSubjectEventStatus;
    }

    /**
     * @return Returns the oldSubjectEventStatus.
     */
    public SubjectEventStatus getOldSubjectEventStatus() {
        return oldSubjectEventStatus;
    }

    /**
     * @param oldSubjectEventStatus
     *            The oldSubjectEventStatus to set.
     */
    public void setOldSubjectEventStatus(SubjectEventStatus oldSubjectEventStatus) {
        this.oldSubjectEventStatus = oldSubjectEventStatus;
    }

    /**
     * @return Returns the definition.
     */
    public StudyEventDefinitionBean getDefinition() {
        return definition;
    }

    /**
     * @param definition
     *            The definition to set.
     */
    public void setDefinition(StudyEventDefinitionBean definition) {
        this.definition = definition;
    }

    /**
     * @return Returns the auditEvent.
     */
    public AuditEventBean getAuditEvent() {
        return auditEvent;
    }

    /**
     * @param auditEvent
     *            The auditEvent to set.
     */
    public void setAuditEvent(AuditEventBean auditEvent) {
        this.auditEvent = auditEvent;
    }

    /**
     * @return Returns the updater.
     */
    public UserAccountBean getUpdater() {
        return updater;
    }

    /**
     * @param updater
     *            The updater to set.
     */
    public void setUpdater(UserAccountBean updater) {
        this.updater = updater;
    }
}
