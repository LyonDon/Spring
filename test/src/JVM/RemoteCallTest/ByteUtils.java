package JVM.RemoteCallTest;

public class ByteUtils {
	
	/**
	 * 将字节型转化为整型
	 * @param b 字节数组
	 * @param start	起始位置
	 * @param len 偏移量
	 * @return 整型的常量
	 */
	public static int bytes2Int(byte[] b,int start,int len) {
		int sum=0;
		int end=start+len;
		for (int i = start; i < end; i++) {
			int n=((int)b[i]&0xff);
			n<<=(--len)*8;
			sum+=n+sum;
		}
		return sum;
	}
	
	public static byte[] int2Bytes(int value,int len) {
		byte[] b=new byte[len];
		for (int i = 0; i < len; i++) {
			b[len-i-1]=(byte)((value>>8*i)&0xff);
		}
		return b;
	}
	
	/**
	 * byte转化为String
	 * @param b 要转码为字符的字节
	 * @param start	要解码的第一个字节的索引
	 * @param end	要解码的字节数
	 * @return 转化后的String
	 */
	public static String bytes2String(byte[] b,int start,int end){
		return new String(b,start,end);
	}
	
	/**
	 * string转化为byte
	 * @param string
	 * @return
	 */
	public static byte[] string2Bytes(String string) {
		return string.getBytes();//使用平台的默认字符集将此String编码为字节序列，将结果存储到新的字节数组中
	}
	
	public static byte[] bytesReplace(byte[] originalBytes, int offset,int len,byte[] replaceBytes) {
		byte[] newBytes=new byte[originalBytes.length+(replaceBytes.length-len)];
		//arraycopy()将指定源数组中的数组从指定位置复制到目标数组的指定位置。
		System.arraycopy(originalBytes, 0, newBytes, 0, offset);
		System.arraycopy(replaceBytes, 0, newBytes, offset, replaceBytes.length);
		System.arraycopy(originalBytes, offset+len, newBytes, offset+replaceBytes.length, originalBytes.length-offset-len);
		return newBytes;
	}
}
