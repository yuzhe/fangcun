package net.ssln.fangcun.gupiao.domain;

import java.util.Date;

public class JijinBond {
	  private String id;

	    private String code;

	    /**
	     * 股票名
	     */
	    private String zcname;

	    /**
	     * 股票代码
	     */
	    private String zccode;

	    private String zctype;

	    /**
	     * 占净资产比
	     */
	    private double ccrate;

	    private Date enddate;

	    private double hold;

	    /**
	     * 老股票代码
	     */
	    private String oldzccode;

	    /**
	     * 当前总价
	     */
	    private double totalprice;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getZcname() {
			return zcname;
		}

		public void setZcname(String zcname) {
			this.zcname = zcname;
		}

		public String getZccode() {
			return zccode;
		}

		public void setZccode(String zccode) {
			this.zccode = zccode;
		}

		public String getZctype() {
			return zctype;
		}

		public void setZctype(String zctype) {
			this.zctype = zctype;
		}

		public double getCcrate() {
			return ccrate;
		}

		public void setCcrate(double ccrate) {
			this.ccrate = ccrate;
		}

		public Date getEnddate() {
			return enddate;
		}

		public void setEnddate(Date enddate) {
			this.enddate = enddate;
		}

		public double getHold() {
			return hold;
		}

		public void setHold(double hold) {
			this.hold = hold;
		}

		public String getOldzccode() {
			return oldzccode;
		}

		public void setOldzccode(String oldzccode) {
			this.oldzccode = oldzccode;
		}

		public double getTotalprice() {
			return totalprice;
		}

		public void setTotalprice(double totalprice) {
			this.totalprice = totalprice;
		}
	    
}
