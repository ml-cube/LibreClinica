/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.domain.datamap;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.akaza.openclinica.domain.DataMapDomainObject;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * DnItemDataMap generated by hbm2java
 */
@Entity
@Table(name = "dn_item_data_map")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DnItemDataMap extends DataMapDomainObject {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4701962037276015270L;
	private DnItemDataMapId dnItemDataMapId;
    private ItemData itemData;
    private DiscrepancyNote discrepancyNote;
    private StudySubject studySubject;
    private boolean activated;

    public DnItemDataMap() {
    }

    public DnItemDataMap(ItemData itemData,
            DiscrepancyNote discrepancyNote,
            StudySubject studySubject) {
        this.itemData = itemData;
        this.discrepancyNote = discrepancyNote;
        this.studySubject = studySubject;
        this.activated = true;
    }

    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "itemDataId", column = @Column(name = "item_data_id")),
        @AttributeOverride(name = "discrepancyNoteId", column = @Column(name = "discrepancy_note_id")),
        @AttributeOverride(name = "columnName", column = @Column(name = "column_name")),
        @AttributeOverride(name = "studySubjectId", column = @Column(name = "study_subject_id")) })
    public DnItemDataMapId getDnItemDataMapId() {
        return dnItemDataMapId;
    }

    public void setDnItemDataMapId(DnItemDataMapId dnItemDataMapId) {
        this.dnItemDataMapId = dnItemDataMapId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_data_id", insertable = false, updatable = false)
    public ItemData getItemData() {
        return this.itemData;
    }

    public void setItemData(ItemData itemData) {
        this.itemData = itemData;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "discrepancy_note_id", insertable = false, updatable = false)
    public DiscrepancyNote getDiscrepancyNote() {
        return this.discrepancyNote;
    }

    public void setDiscrepancyNote(DiscrepancyNote discrepancyNote) {
        this.discrepancyNote = discrepancyNote;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_subject_id", insertable = false, updatable = false)
     public StudySubject getStudySubject() {
        return studySubject;
    }

    public void setStudySubject(StudySubject studySubject) {
        this.studySubject = studySubject;
    }

    @Column(name = "activated")
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
