/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.domain.datamap;
// Generated Jul 31, 2013 2:03:33 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.akaza.openclinica.domain.DataMapDomainObject;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * StudyParameterValue generated by hbm2java
 */
@Entity
@Table(name = "study_parameter_value")
@GenericGenerator(name = "id-generator", strategy = "native", parameters = { @Parameter(name = "sequence_name", value = "study_parameter_value_study_parameter_value_id_seq") })
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class StudyParameterValue  extends DataMapDomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3897393464806732472L;
	private int studyParameterValueId;
	private Study study;
	private StudyParameter studyParameter;
	private String value;

	public StudyParameterValue() {
	}

	public StudyParameterValue(int studyParameterValueId) {
		this.studyParameterValueId = studyParameterValueId;
	}

	public StudyParameterValue(int studyParameterValueId, Study study,
			StudyParameter studyParameter, String value) {
		this.studyParameterValueId = studyParameterValueId;
		this.study = study;
		this.studyParameter = studyParameter;
		this.value = value;
	}

	@Id
    @Column(name = "study_parameter_value_id", unique = true, nullable = false)
    @GeneratedValue(generator = "id-generator")
	public Integer getStudyParameterValueId() {
		return this.studyParameterValueId;
	}

	public void setStudyParameterValueId(int studyParameterValueId) {
		this.studyParameterValueId = studyParameterValueId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "study_id", insertable = false, updatable = false)
	public Study getStudy() {
		return this.study;
	}

	public void setStudy(Study study) {
		this.study = study;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parameter", referencedColumnName = "handle", insertable = false, updatable = false)
	public StudyParameter getStudyParameter() {
		return this.studyParameter;
	}

	public void setStudyParameter(StudyParameter studyParameter) {
		this.studyParameter = studyParameter;
	}

	@Column(name = "value", insertable = false, updatable = false, length = 50)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
