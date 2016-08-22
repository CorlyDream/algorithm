package test;

public enum StorageType {

	UNKNOW(0,"null", "未知状态"),
	
	TEMP(1, "storagetemp", "温度"),
	
	DOOR(2, "storagedoor", "门");
	
	private int type;
	private String table;
	private String desc;
	
	private StorageType(int type, String table, String desc) {
		this.type = type;
		this.table = table;
		this.desc = desc;
	}
	
	public static StorageType getStorageType(int type){
		for(StorageType item : values()){
			if (item.getType() == type) {
				return item;
			}
		}
		return UNKNOW;
	}

	public int getType() {
		return type;
	}

	public String getTable() {
		return table;
	}

	public String getDesc() {
		return desc;
	}
}
