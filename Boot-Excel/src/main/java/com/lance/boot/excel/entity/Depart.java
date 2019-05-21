package com.lance.boot.excel.entity;




import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Depart.
 */
@Entity
@Table(name = "depart")
public class Depart implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 编码
     */
    @NotNull
    @Size(max = 50)
    @Column(name = "code", length = 50, nullable = false)
    private String code;

    /**
     * 部门id
     */
    @NotNull
    @Size(max = 50)
    @Column(name = "depart_id", length = 50, nullable = false)
    private String departId;

    /**
     * 父级部门id
     */
    @NotNull
    @Size(max = 50)
    @Column(name = "parent_depart_id", length = 50, nullable = false)
    private String parentDepartId;

    /**
     * 部门名称
     */
    @NotNull
    @Size(max = 50)
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    /**
     * 是否养生
     */
    @Column(name = "is_health")
    private Boolean isHealth;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public Depart code(String code) {
        this.code = code;
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDepartId() {
        return departId;
    }

    public Depart departId(String departId) {
        this.departId = departId;
        return this;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getParentDepartId() {
        return parentDepartId;
    }

    public Depart parentDepartId(String parentDepartId) {
        this.parentDepartId = parentDepartId;
        return this;
    }

    public void setParentDepartId(String parentDepartId) {
        this.parentDepartId = parentDepartId;
    }

    public String getName() {
        return name;
    }

    public Depart name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isIsHealth() {
        return isHealth;
    }

    public Depart isHealth(Boolean isHealth) {
        this.isHealth = isHealth;
        return this;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Depart depart = (Depart) o;
        if (depart.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), depart.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Depart{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", departId='" + getDepartId() + "'" +
            ", parentDepartId='" + getParentDepartId() + "'" +
            ", name='" + getName() + "'" +
            ", isHealth='" + isIsHealth() + "'" +
            "}";
    }
}
