/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.domain.datamap;

//default package
//Generated Jul 31, 2013 2:03:33 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.akaza.openclinica.domain.DataMapDomainObject;

/**
* GroupClassTypes generated by hbm2java
*/
@Entity
@Table(name = "group_class_types")
public class GroupClassTypes  extends DataMapDomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5315561337629518434L;
	private int groupClassTypeId;
	private String name;
	private String description;
	private List<StudyGroupClass> studyGroupClasses ;

	public GroupClassTypes() {
	}

	public GroupClassTypes(int groupClassTypeId) {
		this.groupClassTypeId = groupClassTypeId;
	}

	public GroupClassTypes(int groupClassTypeId, String name,
			String description, List<StudyGroupClass>  studyGroupClasses) {
		this.groupClassTypeId = groupClassTypeId;
		this.name = name;
		this.description = description;
		this.studyGroupClasses = studyGroupClasses;
	}

	@Id
	@Column(name = "group_class_type_id", unique = true, nullable = false)
	public int getGroupClassTypeId() {
		return this.groupClassTypeId;
	}

	public void setGroupClassTypeId(int groupClassTypeId) {
		this.groupClassTypeId = groupClassTypeId;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 1000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groupClassTypes")
	public List<StudyGroupClass> getStudyGroupClasses() {
		return this.studyGroupClasses;
	}

	public void setStudyGroupClasses(List<StudyGroupClass> studyGroupClasses) {
		this.studyGroupClasses = studyGroupClasses;
	}

}
