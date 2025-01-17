/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.domain.datamap;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.akaza.openclinica.domain.DataMapDomainObject;
import org.akaza.openclinica.domain.Status;
import org.akaza.openclinica.domain.user.UserAccount;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

/**
 * StudyEventDefinition generated by hbm2java
 */
@Entity
@Table(name = "study_event_definition", uniqueConstraints = @UniqueConstraint(columnNames = "oc_oid"))
@GenericGenerator(name = "id-generator", strategy = "native", parameters = { @Parameter(name = "sequence_name", value = "study_event_definition_study_event_definition_id_seq") })
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class StudyEventDefinition  extends DataMapDomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8228007886538850127L;
	private int studyEventDefinitionId;
	private UserAccount userAccount;
	private Study study;
	private Status status;
	private String name;
	private String description;
	private Boolean repeating;
	private String type;
	private String category;
	private Date dateCreated;
	private Date dateUpdated;
	private Integer updateId;
	private Integer ordinal;
	private String oc_oid;
	private List<EventDefinitionCrf> eventDefinitionCrfs ;
	private List<StudyEvent> studyEvents ;
	public StudyEventDefinition() {
	}

	public StudyEventDefinition(int studyEventDefinitionId, String ocOid) {
		this.studyEventDefinitionId = studyEventDefinitionId;
		this.oc_oid = ocOid;
	}

	public StudyEventDefinition(int studyEventDefinitionId,
			UserAccount userAccount, Study study, Status status, String name,
			String description, Boolean repeating, String type,
			String category, Date dateCreated, Date dateUpdated,
			Integer updateId, Integer ordinal, String ocOid,
			List<EventDefinitionCrf> eventDefinitionCrfs, List<StudyEvent> studyEvents) {
		
		this.studyEventDefinitionId = studyEventDefinitionId;
		this.userAccount = userAccount;
		this.study = study;
		this.status = status;
		this.name = name;
		this.description = description;
		this.repeating = repeating;
		this.type = type;
		this.category = category;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.updateId = updateId;
		this.ordinal = ordinal;
		this.oc_oid = ocOid;
		this.eventDefinitionCrfs = eventDefinitionCrfs;
		this.studyEvents = studyEvents;
	}

	@Id
	@Column(name = "study_event_definition_id", unique = true, nullable = false)
	@GeneratedValue(generator = "id-generator")

	public int getStudyEventDefinitionId() {
		return this.studyEventDefinitionId;
	}

	public void setStudyEventDefinitionId(int studyEventDefinitionId) {
		this.studyEventDefinitionId = studyEventDefinitionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner_id")
	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "study_id")
	public Study getStudy() {
		return this.study;
	}

	public void setStudy(Study study) {
		this.study = study;
	}

	@Type(type = "status")
    @Column(name = "status_id")
    public Status getStatus() {
        if (status != null) {
            return status;
        } else
            return Status.AVAILABLE;
    }

	public void setStatus(Status status) {
		this.status = status;
	}

	@Column(name = "name", length = 2000)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 2000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "repeating")
	public Boolean getRepeating() {
		return this.repeating;
	}

	public void setRepeating(Boolean repeating) {
		this.repeating = repeating;
	}

	@Column(name = "type", length = 20)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "category", length = 2000)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_created", length = 4)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_updated", length = 4)
	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	@Column(name = "update_id")
	public Integer getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(Integer updateId) {
		this.updateId = updateId;
	}

	@Column(name = "ordinal")
	
	public Integer getOrdinal() {
		return this.ordinal;
	}

	public void setOrdinal(Integer ordinal) {
		this.ordinal = ordinal;
	}

	@Column(name = "oc_oid", unique = true, nullable = false, length = 40)
	public String getOc_oid() {
		return this.oc_oid;
	}

	public void setOc_oid(String ocOid) {
		this.oc_oid = ocOid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studyEventDefinition")
	@OrderBy("ordinal asc")
	public List<EventDefinitionCrf> getEventDefinitionCrfs() {
		return this.eventDefinitionCrfs;
	}

	public void setEventDefinitionCrfs(List<EventDefinitionCrf> eventDefinitionCrfs) {
		this.eventDefinitionCrfs = eventDefinitionCrfs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studyEventDefinition")
	
	public List<StudyEvent> getStudyEvents() {
		return this.studyEvents;
	}

	public void setStudyEvents(List<StudyEvent> studyEvents) {
		this.studyEvents = studyEvents;
	}

	
}
