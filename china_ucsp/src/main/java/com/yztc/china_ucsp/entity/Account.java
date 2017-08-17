package com.yztc.china_ucsp.entity;

import java.sql.Date;

public class Account {
	private int id;
	private int RECOMMENDER_ID;   /*ÕÊºÅID*/
	private String LOGIN_NAME;    /*µÇÂ½Ãû*/
	private String LOGIN_PASSWD;  /*µÇÂ½ÃÜÂë*/
	private char STATUS;          /*×´Ì¬*/
	private Date CREATIME;
	private Date PAUSE_DATE;
	private Date CLOSE_DATE;
	private String REAL_NAME;
	private String IDCARD_NO;
	private String BIRTHDATE;
	private char GENDER;
	private String OCCUPATION;
	private String TELEPHONE;
	private String EMAIL;
	private String MAILADDRESS;
	private String ZIPCODE;
	private String QQ;
	private Date LAST_LOGIN_TIME;
	private String LAST_LOGIN_IP;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRECOMMENDER_ID() {
		return RECOMMENDER_ID;
	}
	public void setRECOMMENDER_ID(int rECOMMENDER_ID) {
		RECOMMENDER_ID = rECOMMENDER_ID;
	}
	public String getLOGIN_NAME() {
		return LOGIN_NAME;
	}
	public void setLOGIN_NAME(String lOGIN_NAME) {
		LOGIN_NAME = lOGIN_NAME;
	}
	public String getLOGIN_PASSWD() {
		return LOGIN_PASSWD;
	}
	public void setLOGIN_PASSWD(String lOGIN_PASSWD) {
		LOGIN_PASSWD = lOGIN_PASSWD;
	}
	public char getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(char sTATUS) {
		STATUS = sTATUS;
	}
	public Date getCREATIME() {
		return CREATIME;
	}
	public void setCREATIME(Date cREATIME) {
		CREATIME = cREATIME;
	}
	public Date getPAUSE_DATE() {
		return PAUSE_DATE;
	}
	public void setPAUSE_DATE(Date pAUSE_DATE) {
		PAUSE_DATE = pAUSE_DATE;
	}
	public Date getCLOSE_DATE() {
		return CLOSE_DATE;
	}
	public void setCLOSE_DATE(Date cLOSE_DATE) {
		CLOSE_DATE = cLOSE_DATE;
	}
	public String getREAL_NAME() {
		return REAL_NAME;
	}
	public void setREAL_NAME(String rEAL_NAME) {
		REAL_NAME = rEAL_NAME;
	}
	public String getIDCARD_NO() {
		return IDCARD_NO;
	}
	public void setIDCARD_NO(String iDCARD_NO) {
		IDCARD_NO = iDCARD_NO;
	}
	public String getBIRTHDATE() {
		return BIRTHDATE;
	}
	public void setBIRTHDATE(String bIRTHDATE) {
		BIRTHDATE = bIRTHDATE;
	}
	public char getGENDER() {
		return GENDER;
	}
	public void setGENDER(char gENDER) {
		GENDER = gENDER;
	}
	public String getOCCUPATION() {
		return OCCUPATION;
	}
	public void setOCCUPATION(String oCCUPATION) {
		OCCUPATION = oCCUPATION;
	}
	public String getTELEPHONE() {
		return TELEPHONE;
	}
	public void setTELEPHONE(String tELEPHONE) {
		TELEPHONE = tELEPHONE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getMAILADDRESS() {
		return MAILADDRESS;
	}
	public void setMAILADDRESS(String mAILADDRESS) {
		MAILADDRESS = mAILADDRESS;
	}
	public String getZIPCODE() {
		return ZIPCODE;
	}
	public void setZIPCODE(String zIPCODE) {
		ZIPCODE = zIPCODE;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	public Date getLAST_LOGIN_TIME() {
		return LAST_LOGIN_TIME;
	}
	public void setLAST_LOGIN_TIME(Date lAST_LOGIN_TIME) {
		LAST_LOGIN_TIME = lAST_LOGIN_TIME;
	}
	public String getLAST_LOGIN_IP() {
		return LAST_LOGIN_IP;
	}
	public void setLAST_LOGIN_IP(String lAST_LOGIN_IP) {
		LAST_LOGIN_IP = lAST_LOGIN_IP;
	}
	public Account(int id, int rECOMMENDER_ID, String lOGIN_NAME, String lOGIN_PASSWD, char sTATUS, Date cREATIME,
			Date pAUSE_DATE, Date cLOSE_DATE, String rEAL_NAME, String iDCARD_NO, String bIRTHDATE, char gENDER,
			String oCCUPATION, String tELEPHONE, String eMAIL, String mAILADDRESS, String zIPCODE, String qQ,
			Date lAST_LOGIN_TIME, String lAST_LOGIN_IP) {
		super();
		this.id = id;
		RECOMMENDER_ID = rECOMMENDER_ID;
		LOGIN_NAME = lOGIN_NAME;
		LOGIN_PASSWD = lOGIN_PASSWD;
		STATUS = sTATUS;
		CREATIME = cREATIME;
		PAUSE_DATE = pAUSE_DATE;
		CLOSE_DATE = cLOSE_DATE;
		REAL_NAME = rEAL_NAME;
		IDCARD_NO = iDCARD_NO;
		BIRTHDATE = bIRTHDATE;
		GENDER = gENDER;
		OCCUPATION = oCCUPATION;
		TELEPHONE = tELEPHONE;
		EMAIL = eMAIL;
		MAILADDRESS = mAILADDRESS;
		ZIPCODE = zIPCODE;
		QQ = qQ;
		LAST_LOGIN_TIME = lAST_LOGIN_TIME;
		LAST_LOGIN_IP = lAST_LOGIN_IP;
	}
	public Account() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BIRTHDATE == null) ? 0 : BIRTHDATE.hashCode());
		result = prime * result + ((CLOSE_DATE == null) ? 0 : CLOSE_DATE.hashCode());
		result = prime * result + ((CREATIME == null) ? 0 : CREATIME.hashCode());
		result = prime * result + ((EMAIL == null) ? 0 : EMAIL.hashCode());
		result = prime * result + GENDER;
		result = prime * result + ((IDCARD_NO == null) ? 0 : IDCARD_NO.hashCode());
		result = prime * result + ((LAST_LOGIN_IP == null) ? 0 : LAST_LOGIN_IP.hashCode());
		result = prime * result + ((LAST_LOGIN_TIME == null) ? 0 : LAST_LOGIN_TIME.hashCode());
		result = prime * result + ((LOGIN_NAME == null) ? 0 : LOGIN_NAME.hashCode());
		result = prime * result + ((LOGIN_PASSWD == null) ? 0 : LOGIN_PASSWD.hashCode());
		result = prime * result + ((MAILADDRESS == null) ? 0 : MAILADDRESS.hashCode());
		result = prime * result + ((OCCUPATION == null) ? 0 : OCCUPATION.hashCode());
		result = prime * result + ((PAUSE_DATE == null) ? 0 : PAUSE_DATE.hashCode());
		result = prime * result + ((QQ == null) ? 0 : QQ.hashCode());
		result = prime * result + ((REAL_NAME == null) ? 0 : REAL_NAME.hashCode());
		result = prime * result + RECOMMENDER_ID;
		result = prime * result + STATUS;
		result = prime * result + ((TELEPHONE == null) ? 0 : TELEPHONE.hashCode());
		result = prime * result + ((ZIPCODE == null) ? 0 : ZIPCODE.hashCode());
		result = prime * result + id;
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
		Account other = (Account) obj;
		if (BIRTHDATE == null) {
			if (other.BIRTHDATE != null)
				return false;
		} else if (!BIRTHDATE.equals(other.BIRTHDATE))
			return false;
		if (CLOSE_DATE == null) {
			if (other.CLOSE_DATE != null)
				return false;
		} else if (!CLOSE_DATE.equals(other.CLOSE_DATE))
			return false;
		if (CREATIME == null) {
			if (other.CREATIME != null)
				return false;
		} else if (!CREATIME.equals(other.CREATIME))
			return false;
		if (EMAIL == null) {
			if (other.EMAIL != null)
				return false;
		} else if (!EMAIL.equals(other.EMAIL))
			return false;
		if (GENDER != other.GENDER)
			return false;
		if (IDCARD_NO == null) {
			if (other.IDCARD_NO != null)
				return false;
		} else if (!IDCARD_NO.equals(other.IDCARD_NO))
			return false;
		if (LAST_LOGIN_IP == null) {
			if (other.LAST_LOGIN_IP != null)
				return false;
		} else if (!LAST_LOGIN_IP.equals(other.LAST_LOGIN_IP))
			return false;
		if (LAST_LOGIN_TIME == null) {
			if (other.LAST_LOGIN_TIME != null)
				return false;
		} else if (!LAST_LOGIN_TIME.equals(other.LAST_LOGIN_TIME))
			return false;
		if (LOGIN_NAME == null) {
			if (other.LOGIN_NAME != null)
				return false;
		} else if (!LOGIN_NAME.equals(other.LOGIN_NAME))
			return false;
		if (LOGIN_PASSWD == null) {
			if (other.LOGIN_PASSWD != null)
				return false;
		} else if (!LOGIN_PASSWD.equals(other.LOGIN_PASSWD))
			return false;
		if (MAILADDRESS == null) {
			if (other.MAILADDRESS != null)
				return false;
		} else if (!MAILADDRESS.equals(other.MAILADDRESS))
			return false;
		if (OCCUPATION == null) {
			if (other.OCCUPATION != null)
				return false;
		} else if (!OCCUPATION.equals(other.OCCUPATION))
			return false;
		if (PAUSE_DATE == null) {
			if (other.PAUSE_DATE != null)
				return false;
		} else if (!PAUSE_DATE.equals(other.PAUSE_DATE))
			return false;
		if (QQ == null) {
			if (other.QQ != null)
				return false;
		} else if (!QQ.equals(other.QQ))
			return false;
		if (REAL_NAME == null) {
			if (other.REAL_NAME != null)
				return false;
		} else if (!REAL_NAME.equals(other.REAL_NAME))
			return false;
		if (RECOMMENDER_ID != other.RECOMMENDER_ID)
			return false;
		if (STATUS != other.STATUS)
			return false;
		if (TELEPHONE == null) {
			if (other.TELEPHONE != null)
				return false;
		} else if (!TELEPHONE.equals(other.TELEPHONE))
			return false;
		if (ZIPCODE == null) {
			if (other.ZIPCODE != null)
				return false;
		} else if (!ZIPCODE.equals(other.ZIPCODE))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", RECOMMENDER_ID=" + RECOMMENDER_ID + ", LOGIN_NAME=" + LOGIN_NAME
				+ ", LOGIN_PASSWD=" + LOGIN_PASSWD + ", STATUS=" + STATUS + ", CREATIME=" + CREATIME + ", PAUSE_DATE="
				+ PAUSE_DATE + ", CLOSE_DATE=" + CLOSE_DATE + ", REAL_NAME=" + REAL_NAME + ", IDCARD_NO=" + IDCARD_NO
				+ ", BIRTHDATE=" + BIRTHDATE + ", GENDER=" + GENDER + ", OCCUPATION=" + OCCUPATION + ", TELEPHONE="
				+ TELEPHONE + ", EMAIL=" + EMAIL + ", MAILADDRESS=" + MAILADDRESS + ", ZIPCODE=" + ZIPCODE + ", QQ="
				+ QQ + ", LAST_LOGIN_TIME=" + LAST_LOGIN_TIME + ", LAST_LOGIN_IP=" + LAST_LOGIN_IP + "]";
	}
	
}
