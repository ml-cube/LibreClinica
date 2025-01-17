/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
// Generated Aug 3, 2015 9:49:28 AM by Hibernate Tools 3.4.0.CR1
package org.akaza.openclinica.domain.datamap;

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
 * CrfVersionMedia generated by hbm2java
 */
@Entity
@Table(name = "crf_version_media", schema = "public")
@GenericGenerator(name = "id-generator", strategy = "native", parameters = { @Parameter(name = "sequence_name", value = "crf_version_media_crf_version_media_id_seq") })
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CrfVersionMedia extends DataMapDomainObject {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6881771163621267155L;
	private int crfVersionMediaId;
    private CrfVersion crfVersion;
    private String name;
    private String path;

    public CrfVersionMedia() {
    }

    public CrfVersionMedia(int crfVersionMediaId, CrfVersion crfVersion, String name, String path) {
        this.crfVersionMediaId = crfVersionMediaId;
        this.crfVersion = crfVersion;
        this.name = name;
        this.path = path;
    }

    @Id
    @Column(name = "crf_version_media_id", unique = true, nullable = false)
    @GeneratedValue(generator = "id-generator")
    public int getCrfVersionMediaId() {
        return this.crfVersionMediaId;
    }

    public void setCrfVersionMediaId(int crfVersionMediaId) {
        this.crfVersionMediaId = crfVersionMediaId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "crf_version_id", nullable = false)
    public CrfVersion getCrfVersion() {
        return this.crfVersion;
    }

    public void setCrfVersion(CrfVersion crfVersion) {
        this.crfVersion = crfVersion;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "path", nullable = false, length = 4000)
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
