package com.example.myassignment.myassigmnement.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by satheesh on 17,July,2018
 */
public class Result {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("adx_keywords")
    @Expose
    private String adxKeywords;
    @SerializedName("column")
    @Expose
    private Object column;
    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("byline")
    @Expose
    private String byline;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("abstract")
    @Expose
    private String _abstract;
    @SerializedName("published_date")
    @Expose
    private String publishedDate;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("asset_id")
    @Expose
    private long assetId;
    @SerializedName("views")
    @Expose
    private long views;
    @SerializedName("des_facet")
    @Expose
    private Object des_facet;
    @SerializedName("org_facet")
    @Expose
    private Object org_facet;
    @SerializedName("per_facet")
    @Expose
    private Object perFacet;
    @SerializedName("geo_facet")
    @Expose
    private Object geo_facet;
    @SerializedName("media")
    @Expose
    private List<Medium> media = null;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAdxKeywords() {
        return adxKeywords;
    }

    public void setAdxKeywords(String adxKeywords) {
        this.adxKeywords = adxKeywords;
    }

    public Object getColumn() {
        return column;
    }

    public void setColumn(Object column) {
        this.column = column;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstract() {
        return _abstract;
    }

    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAssetId() {
        return assetId;
    }

    public void setAssetId(long assetId) {
        this.assetId = assetId;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }





    public Object getPerFacet() {
        return perFacet;
    }

    public void setPerFacet(Object perFacet) {
        this.perFacet = perFacet;
    }



    public List<Medium> getMedia() {
        return media;
    }

    public void setMedia(List<Medium> media) {
        this.media = media;
    }

    public String get_abstract() {
        return _abstract;
    }

    public void set_abstract(String _abstract) {
        this._abstract = _abstract;
    }

    public Object getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(Object des_facet) {
        this.des_facet = des_facet;
    }

    public Object getOrg_facet() {
        return org_facet;
    }

    public void setOrg_facet(Object org_facet) {
        this.org_facet = org_facet;
    }

    public Object getGeo_facet() {
        return geo_facet;
    }

    public void setGeo_facet(Object geo_facet) {
        this.geo_facet = geo_facet;
    }
}
