/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
// default package
// Generated Jul 31, 2013 2:03:33 PM by Hibernate Tools 3.4.0.CR1
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
 * ItemGroupMetadata generated by hbm2java
 */
@Entity
@Table(name = "item_group_metadata")
@GenericGenerator(name = "id-generator", strategy = "native", parameters = { @Parameter(name = "sequence_name", value = "item_group_metadata_item_group_metadata_id_seq") })
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ItemGroupMetadata extends DataMapDomainObject {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2541048099025244392L;

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + itemGroupMetadataId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemGroupMetadata other = (ItemGroupMetadata) obj;
        if (itemGroupMetadataId != other.itemGroupMetadataId)
            return false;
        return true;
    }

    private int itemGroupMetadataId;
    private CrfVersion crfVersion;
    private Item item;
    private ItemGroup itemGroup;
    private String header;
    private String subheader;
    private String layout;
    private Integer repeatNumber;
    private Integer repeatMax;
    private String repeatArray;
    private Integer rowStartNumber;
    private int ordinal;
    private Integer borders;
    private Boolean showGroup;
    private boolean repeatingGroup;

    public ItemGroupMetadata() {
    }

    public ItemGroupMetadata(int itemGroupMetadataId, CrfVersion crfVersion, Item item, ItemGroup itemGroup, int ordinal, boolean repeatingGroup) {
        this.itemGroupMetadataId = itemGroupMetadataId;
        this.crfVersion = crfVersion;
        this.item = item;
        this.itemGroup = itemGroup;
        this.ordinal = ordinal;
        this.repeatingGroup = repeatingGroup;
    }

    public ItemGroupMetadata(int itemGroupMetadataId, CrfVersion crfVersion, Item item, ItemGroup itemGroup, String header, String subheader, String layout,
            Integer repeatNumber, Integer repeatMax, String repeatArray, Integer rowStartNumber, int ordinal, Integer borders, Boolean showGroup,
            boolean repeatingGroup) {
        this.itemGroupMetadataId = itemGroupMetadataId;
        this.crfVersion = crfVersion;
        this.item = item;
        this.itemGroup = itemGroup;
        this.header = header;
        this.subheader = subheader;
        this.layout = layout;
        this.repeatNumber = repeatNumber;
        this.repeatMax = repeatMax;
        this.repeatArray = repeatArray;
        this.rowStartNumber = rowStartNumber;
        this.ordinal = ordinal;
        this.borders = borders;
        this.showGroup = showGroup;
        this.repeatingGroup = repeatingGroup;
    }

    @Id
    @Column(name = "item_group_metadata_id", unique = true, nullable = false)
    @GeneratedValue(generator = "id-generator")
    public int getItemGroupMetadataId() {
        return this.itemGroupMetadataId;
    }

    public void setItemGroupMetadataId(int itemGroupMetadataId) {
        this.itemGroupMetadataId = itemGroupMetadataId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "crf_version_id", nullable = false)
    public CrfVersion getCrfVersion() {
        return this.crfVersion;
    }

    public void setCrfVersion(CrfVersion crfVersion) {
        this.crfVersion = crfVersion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", nullable = false)
    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_group_id", nullable = false)
    public ItemGroup getItemGroup() {
        return this.itemGroup;
    }

    public void setItemGroup(ItemGroup itemGroup) {
        this.itemGroup = itemGroup;
    }

    @Column(name = "header")
    public String getHeader() {
        return this.header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Column(name = "subheader")
    public String getSubheader() {
        return this.subheader;
    }

    public void setSubheader(String subheader) {
        this.subheader = subheader;
    }

    @Column(name = "layout", length = 100)
    public String getLayout() {
        return this.layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    @Column(name = "repeat_number")
    public Integer getRepeatNumber() {
        return this.repeatNumber;
    }

    public void setRepeatNumber(Integer repeatNumber) {
        this.repeatNumber = repeatNumber;
    }

    @Column(name = "repeat_max")
    public Integer getRepeatMax() {
        return this.repeatMax;
    }

    public void setRepeatMax(Integer repeatMax) {
        this.repeatMax = repeatMax;
    }

    @Column(name = "repeat_array")
    public String getRepeatArray() {
        return this.repeatArray;
    }

    public void setRepeatArray(String repeatArray) {
        this.repeatArray = repeatArray;
    }

    @Column(name = "row_start_number")
    public Integer getRowStartNumber() {
        return this.rowStartNumber;
    }

    public void setRowStartNumber(Integer rowStartNumber) {
        this.rowStartNumber = rowStartNumber;
    }

    @Column(name = "ordinal", nullable = false)
    public int getOrdinal() {
        return this.ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    @Column(name = "borders")
    public Integer getBorders() {
        return this.borders;
    }

    public void setBorders(Integer borders) {
        this.borders = borders;
    }

    @Column(name = "show_group")
    public Boolean getShowGroup() {
        return this.showGroup;
    }

    public void setShowGroup(Boolean showGroup) {
        this.showGroup = showGroup;
    }

    @Column(name = "repeating_group", nullable = false)
    public boolean isRepeatingGroup() {
        return this.repeatingGroup;
    }

    public void setRepeatingGroup(boolean repeatingGroup) {
        this.repeatingGroup = repeatingGroup;
    }

}
