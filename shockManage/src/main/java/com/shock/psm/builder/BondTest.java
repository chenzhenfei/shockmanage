package com.shock.psm.builder;



/**
 * 测试建造者模式 date: 2018年7月12日 上午11:40:41 <br/>
 * 
 * @author czf
 * @version
 */
public class BondTest {
	private Long id;

	private String ctime;

	private String rtime;

	private String iCode;

	private String iName;
	
	public BondTest(Builder builder ){
		this.id =builder.id;
		this.ctime =builder.ctime;
		this.rtime =builder.rtime;
		this.iCode =builder.iCode;
		this.iName =builder.iName;
	}
	
	public Long getId() {
		return id;
	}

	public String getCtime() {
		return ctime;
	}

	public String getRtime() {
		return rtime;
	}

	public String getiCode() {
		return iCode;
	}

	public String getiName() {
		return iName;
	}


    /**
     * 内部静态建造类
     * date: 2018年7月12日 上午11:42:15 <br/>  
     * @author czf
     * @version BondTest
     */
	public static class Builder{
		
		private Long id;

		private String ctime;

		private String rtime;

		private String iCode;

		private String iName;

		public Builder() {
			super();
		}
		public Builder setId(Long id ){
			this.id =id;
			return this;
		}
		public Builder addCtime(String ctime ){
			this.ctime =ctime;
			return this;
		}
		public Builder putRtime(String rtime ){
			this.rtime =rtime;
			return this;
		}
		public Builder addiCode(String iCode ){
			this.iCode =iCode;
			return this;
		}
		public Builder addiName(String iName ){
			this.iName =iName;
			return this;
		}
		
		public BondTest build(){
			return new BondTest(this);
		}
	}
	
	public static void main(String[] a){
		BondTest t =new BondTest.Builder().setId(1000L).addCtime("111").putRtime("222").build();
		System.out.print(t.toString());
		
	}
	
	
	
	
}
