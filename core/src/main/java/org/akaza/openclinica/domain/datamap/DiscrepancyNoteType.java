/*
 * LibreClinica is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://libreclinica.org/license
 * LibreClinica, copyright (C) 2020
 */
package org.akaza.openclinica.domain.datamap;
// Generated Jul 31, 2013 2:03:33 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.akaza.openclinica.domain.DataMapDomainObject;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * DiscrepancyNoteType generated by hbm2java
 */
@Entity
@Table(name = "discrepancy_note_type")
@GenericGenerator(name = "id-generator", strategy = "native", parameters = { @Parameter(name = "sequence_name", value = "discrepancy_note_type_discrepancy_note_type_id_seq") })
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DiscrepancyNoteType  extends DataMapDomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8144759137359531384L;
	private int discrepancyNoteTypeId;
	private String name;
	private String description;
	private List<DiscrepancyNote> discrepancyNotes;

	public DiscrepancyNoteType() {
	}

	public DiscrepancyNoteType(int discrepancyNoteTypeId) {
		this.discrepancyNoteTypeId = discrepancyNoteTypeId;
	}

	public DiscrepancyNoteType(int discrepancyNoteTypeId, String name,
			String description, List<DiscrepancyNote> discrepancyNotes) {
		this.discrepancyNoteTypeId = discrepancyNoteTypeId;
		this.name = name;
		this.description = description;
		this.discrepancyNotes = discrepancyNotes;
	}

	


	
	
	@Id
	@Column(name = "discrepancy_note_type_id", unique = true, nullable = false)
	@GeneratedValue(generator = "id-generator")

	public int getDiscrepancyNoteTypeId() {
		return this.discrepancyNoteTypeId;
	}

	public void setDiscrepancyNoteTypeId(int discrepancyNoteTypeId) {
		this.discrepancyNoteTypeId = discrepancyNoteTypeId;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "discrepancyNoteType")
	public List<DiscrepancyNote> getDiscrepancyNotes() {
		return this.discrepancyNotes;
	}

	public void setDiscrepancyNotes(List<DiscrepancyNote>  discrepancyNotes) {
		this.discrepancyNotes = discrepancyNotes;
	}



}
