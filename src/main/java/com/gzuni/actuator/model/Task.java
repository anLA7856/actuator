package com.gzuni.actuator.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "ACTUATOR_TASK")
public class Task {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "SYSTEM_TYPE")
    private String systemType;

    @Column(name = "BUSINESS_KEY")
    private String businessKey;

    @Column(name = "STATUS")
    private BigDecimal status;

    @Column(name = "SQL")
    private String sql;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return SYSTEM_TYPE
     */
    public String getSystemType() {
        return systemType;
    }

    /**
     * @param systemType
     */
    public void setSystemType(String systemType) {
        this.systemType = systemType == null ? null : systemType.trim();
    }

    /**
     * @return BUSINESS_KEY
     */
    public String getBusinessKey() {
        return businessKey;
    }

    /**
     * @param businessKey
     */
    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey == null ? null : businessKey.trim();
    }

    /**
     * @return STATUS
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    /**
     * @return SQL
     */
    public String getSql() {
        return sql;
    }

    /**
     * @param sql
     */
    public void setSql(String sql) {
        this.sql = sql == null ? null : sql.trim();
    }
}