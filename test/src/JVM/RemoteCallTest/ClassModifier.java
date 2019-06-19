package JVM.RemoteCallTest;

public class ClassModifier {
	/**
	 * Class文件中常量池的起始偏移
	 */
	private static final int CONSTANT_POOL_COUNT_INDEX=8;
	
	/**
	 * CONSTANT_UTF-8_INFO常量的tag标签
	 */
	private static final int CONSTANT_UTF8_INFO=1;
	
	/**
	 * 常量池中的11种常量所占的长度
	 */
	private static final int[] CONSTANT_ITEM_LENGTH={-1,-1,-1,5,5,9,9,3,3,5,5,5,5};
	
	private static final int u1=1;
	private static final int u2=2;
	
	private byte[] classByte;
	
	public ClassModifier(byte[] classByte){
		this.classByte=classByte;
	}
	
	/**
	 * 修改常量池中的CONSTANT_UTF8_info的内容
	 * @param oldStr 修改前的字符串
	 * @param newStr 修改后的字符串
	 * @return 修改后的结果
	 */
	public byte[] modifyUTF8Constant(String oldString,String newString) {
		int cpc=getConstantPoolCount();
		int offset=CONSTANT_POOL_COUNT_INDEX+u2;
		for (int i = 0; i < cpc; i++) {
			int tag=ByteUtils.bytes2Int(classByte, offset, u1);
			if (tag==CONSTANT_UTF8_INFO) {
				int len=ByteUtils.bytes2Int(classByte, offset+u1, u2);
				offset+=(u1+u2);
				String str=ByteUtils.bytes2String(classByte, offset, u1);
				if (str.equalsIgnoreCase(oldString)) {
					byte[] strBytes=ByteUtils.string2Bytes(newString);
					byte[] strlen=ByteUtils.int2Bytes(newString.length(), u2);
					classByte=ByteUtils.bytesReplace(classByte, offset-u2, u2, strlen);
					classByte=ByteUtils.bytesReplace(classByte, offset, len, strBytes);
					return classByte;
				}else {
					offset+=len;
				}
				
			}else {
				offset+=CONSTANT_ITEM_LENGTH[tag];
			}
			
		}
		return classByte;
	}
	
	public int getConstantPoolCount(){
		return ByteUtils.bytes2Int(classByte, CONSTANT_POOL_COUNT_INDEX, u2);
	}
}
