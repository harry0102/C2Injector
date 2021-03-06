package com.miri.blephone.mediainjector.mgtv.api.category;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "content", propOrder = { "id", "originalid" })
public class DeleteCategoryContent {

    @XmlElement(required = true, nillable = false)
    protected String id;

    @XmlElement(required = true, nillable = false)
    protected String originalid;

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getOriginalid() {
        return this.originalid;
    }

    public void setOriginalid(final String originalid) {
        this.originalid = originalid;
    }

}
