package com.yztc.china_ucsp.entity;

import java.io.Serializable;
import java.sql.Date;

public class Cost implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String  name;
	private Integer base_duration;
	private Integer base_cost;
	private Integer unit_cost;
	private char status;
	private String descr;
	private Date creatime;
	private Date startime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getBase_duration() {
		return base_duration;
	}
	public void setBase_duration(Integer base_duration) {
		this.base_duration = base_duration;
	}
	public Integer getBase_cost() {
		return base_cost;
	}
	public void setBase_cost(Integer base_cost) {
		this.base_cost = base_cost;
	}
	public Integer getUnit_cost() {
		return unit_cost;
	}
	public void setUnit_cost(Integer unit_cost) {
		this.unit_cost = unit_cost;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public Date getCreatime() {
		return creatime;
	}
	public void setCreatime(Date creatime) {
		this.creatime = creatime;
	}
	public Date getStartime() {
		return startime;
	}
	public void setStartime(Date startime) {
		this.startime = startime;
	}
	@Override
	public String toString() {
		return "Cost [id=" + id + ", name=" + name + ", base_duration=" + base_duration + ", base_cost=" + base_cost
				+ ", unit_cost=" + unit_cost + ", status=" + status + ", descr=" + descr + ", creatime=" + creatime
				+ ", startime=" + startime + "]";
	}
	public Cost(Integer id, String name, Integer base_duration, Integer base_cost, Integer unit_cost, char status,
			String descr, Date creatime, Date startime) {
		super();
		this.id = id;
		this.name = name;
		this.base_duration = base_duration;
		this.base_cost = base_cost;
		this.unit_cost = unit_cost;
		this.status = status;
		this.descr = descr;
		this.creatime = creatime;
		this.startime = startime;
	}
	public Cost() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base_cost == null) ? 0 : base_cost.hashCode());
		result = prime * result + ((base_duration == null) ? 0 : base_duration.hashCode());
		result = prime * result + ((creatime == null) ? 0 : creatime.hashCode());
		result = prime * result + ((descr == null) ? 0 : descr.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startime == null) ? 0 : startime.hashCode());
		result = prime * result + status;
		result = prime * result + ((unit_cost == null) ? 0 : unit_cost.hashCode());
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
		Cost other = (Cost) obj;
		if (base_cost == null) {
			if (other.base_cost != null)
				return false;
		} else if (!base_cost.equals(other.base_cost))
			return false;
		if (base_duration == null) {
			if (other.base_duration != null)
				return false;
		} else if (!base_duration.equals(other.base_duration))
			return false;
		if (creatime == null) {
			if (other.creatime != null)
				return false;
		} else if (!creatime.equals(other.creatime))
			return false;
		if (descr == null) {
			if (other.descr != null)
				return false;
		} else if (!descr.equals(other.descr))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (startime == null) {
			if (other.startime != null)
				return false;
		} else if (!startime.equals(other.startime))
			return false;
		if (status != other.status)
			return false;
		if (unit_cost == null) {
			if (other.unit_cost != null)
				return false;
		} else if (!unit_cost.equals(other.unit_cost))
			return false;
		return true;
	}
	
	
	
	

}
