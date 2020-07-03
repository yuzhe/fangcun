package net.ssln.fangcun.gupiao.domain;

import java.util.Date;

public class Jijin {
	private String id;

    private String name;

    private String code;

    private Date newdate;

    /**
     * 周收益
     */
    private double f003nFund33;

    /**
     * 月收益
     */
    private double f008;

    /**
     * 季收益
     */
    private double f009;

    /**
     * 年收益
     */
    private double f011;

    /**
     * 三年收益
     */
    private double f012;

    /**
     * 最近4天收益
     */
    private double rate;

    /**
     * 基金类型
     */
    private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getNewdate() {
		return newdate;
	}

	public void setNewdate(Date newdate) {
		this.newdate = newdate;
	}

	public double getF003nFund33() {
		return f003nFund33;
	}

	public void setF003nFund33(double f003nFund33) {
		this.f003nFund33 = f003nFund33;
	}

	public double getF008() {
		return f008;
	}

	public void setF008(double f008) {
		this.f008 = f008;
	}

	public double getF009() {
		return f009;
	}

	public void setF009(double f009) {
		this.f009 = f009;
	}

	public double getF011() {
		return f011;
	}

	public void setF011(double f011) {
		this.f011 = f011;
	}

	public double getF012() {
		return f012;
	}

	public void setF012(double f012) {
		this.f012 = f012;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
}
