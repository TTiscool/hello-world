package com.example.hello.world.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 物流公司档案
 * </p>
 *
 * @author 11111
 * @since 2020-06-11
 */
public class Logistics implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 物流公司编码
     */
    private String ecode;

    /**
     * 物流公司名称
     */
    private String ename;

    /**
     * 物流公司简称
     */
    private String shortName;

    /**
     * 电子面单物流类型
     */
    private String logisticsType;

    /**
     * 运单号正则表达式
     */
    private String mailnoRegular;

    /**
     * 帐号
     */
    private String accountNo;

    /**
     * 密码
     */
    private String password;

    /**
     * 付款方式
     */
    private String payType;

    /**
     * 快件产品类型
     */
    private Integer expressType;

    /**
     * 月结卡号
     */
    private String monthlyCardNo;

    /**
     * 称重方式
     */
    private Integer weightType;

    /**
     * 发货城市编号
     */
    private String sendCityCode;

    /**
     * 直连电子面单URL
     */
    private String url;

    /**
     * 菜鸟模板URL
     */
    private String cainiaoUrl;

    /**
     * 所属组织
     */
    private Long adOrgId;

    /**
     * 是否可用
     */
    private String isactive;

    /**
     * 所属公司
     */
    private Long adClientId;

    /**
     * 创建人id
     */
    private Long ownerid;

    /**
     * 创建人姓名
     */
    private String ownerename;

    /**
     * 创建人用户名
     */
    private String ownername;

    /**
     * 创建时间
     */
    private LocalDateTime creationdate;

    /**
     * 修改人id
     */
    private Long modifierid;

    /**
     * 修改人姓名
     */
    private String modifierename;

    /**
     * 修改人用户名
     */
    private String modifiername;

    /**
     * 修改时间
     */
    private LocalDateTime modifieddate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEcode() {
        return ecode;
    }

    public void setEcode(String ecode) {
        this.ecode = ecode;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(String logisticsType) {
        this.logisticsType = logisticsType;
    }

    public String getMailnoRegular() {
        return mailnoRegular;
    }

    public void setMailnoRegular(String mailnoRegular) {
        this.mailnoRegular = mailnoRegular;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Integer getExpressType() {
        return expressType;
    }

    public void setExpressType(Integer expressType) {
        this.expressType = expressType;
    }

    public String getMonthlyCardNo() {
        return monthlyCardNo;
    }

    public void setMonthlyCardNo(String monthlyCardNo) {
        this.monthlyCardNo = monthlyCardNo;
    }

    public Integer getWeightType() {
        return weightType;
    }

    public void setWeightType(Integer weightType) {
        this.weightType = weightType;
    }

    public String getSendCityCode() {
        return sendCityCode;
    }

    public void setSendCityCode(String sendCityCode) {
        this.sendCityCode = sendCityCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCainiaoUrl() {
        return cainiaoUrl;
    }

    public void setCainiaoUrl(String cainiaoUrl) {
        this.cainiaoUrl = cainiaoUrl;
    }

    public Long getAdOrgId() {
        return adOrgId;
    }

    public void setAdOrgId(Long adOrgId) {
        this.adOrgId = adOrgId;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public Long getAdClientId() {
        return adClientId;
    }

    public void setAdClientId(Long adClientId) {
        this.adClientId = adClientId;
    }

    public Long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Long ownerid) {
        this.ownerid = ownerid;
    }

    public String getOwnerename() {
        return ownerename;
    }

    public void setOwnerename(String ownerename) {
        this.ownerename = ownerename;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public LocalDateTime getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(LocalDateTime creationdate) {
        this.creationdate = creationdate;
    }

    public Long getModifierid() {
        return modifierid;
    }

    public void setModifierid(Long modifierid) {
        this.modifierid = modifierid;
    }

    public String getModifierename() {
        return modifierename;
    }

    public void setModifierename(String modifierename) {
        this.modifierename = modifierename;
    }

    public String getModifiername() {
        return modifiername;
    }

    public void setModifiername(String modifiername) {
        this.modifiername = modifiername;
    }

    public LocalDateTime getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(LocalDateTime modifieddate) {
        this.modifieddate = modifieddate;
    }

    @Override
    public String toString() {
        return "Logistics{" +
        "id=" + id +
        ", ecode=" + ecode +
        ", ename=" + ename +
        ", shortName=" + shortName +
        ", logisticsType=" + logisticsType +
        ", mailnoRegular=" + mailnoRegular +
        ", accountNo=" + accountNo +
        ", password=" + password +
        ", payType=" + payType +
        ", expressType=" + expressType +
        ", monthlyCardNo=" + monthlyCardNo +
        ", weightType=" + weightType +
        ", sendCityCode=" + sendCityCode +
        ", url=" + url +
        ", cainiaoUrl=" + cainiaoUrl +
        ", adOrgId=" + adOrgId +
        ", isactive=" + isactive +
        ", adClientId=" + adClientId +
        ", ownerid=" + ownerid +
        ", ownerename=" + ownerename +
        ", ownername=" + ownername +
        ", creationdate=" + creationdate +
        ", modifierid=" + modifierid +
        ", modifierename=" + modifierename +
        ", modifiername=" + modifiername +
        ", modifieddate=" + modifieddate +
        "}";
    }
}
