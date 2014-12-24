import java.math.BigInteger;
public class computation{
	public static void main(String args[]){
		
		String c_1 = "3ae81964c8ecf1524b47c42cb0ecd2a3b6768dccd55960d7ff0a998f839b8c312a2cd821c270ae961777dd4dd50aa631fe823a8afd914911adf69c1c6cfda3b3aed01dad372cfdd6e9f63a4cc39e1a455cbfd04dea72bf07c4790d5fec469198ce28113d6d38a7baced9d3c3695ab27cbc5ab434aa8d2b5f53f66a383e079ddaed485d4a2b446e410eafcadbba9f159494c28c4a19fd416dff90f8c141e96d8260f8e6e0901832e31899c48ce0cbdae6a24595a19a01e490c87e7b48860e09006920d8ef7384217358c6db90638d6e8cbc795a091240f24105d8f3b27fe4b98fe9a507e00590b4cded41777b1b8967b0f752231e0e856b8f0132bde30a6e082e";
		BigInteger c1 = new BigInteger(c_1,16); 
		String c_2 = "391e0340e5931a202012572ddacad877e5af3a1d846b70c1e64e3041f9ac0a3c7e8f82621df908eadca44fe777a6b1c799610be829e13ca233982fd268034addb5a79fa19f984631fdf3a61d32fc75ed77176c7a0b719504e804076dca66f10111aa124a7efe743ada75dda2ec53f3c28882a7724928685918261739f960a3648aa3eadc426181aa146a8ba0ff20f1c53de2113e0196af09595dc2ad1a0fe12096ff681f61363044615a7f72edf1f8c6531055e66c1e5f4498434c731d2308fecae46c779379ea3d7d7a5f1c2a0efeb5bc1b8a4af4fb21fce1dae943c27043e86642b3b1e6b889a31e7c4bc01bc2ebae4dc8432344532567d1d3df8b9bcafcbf";
		String aes_k = "19303a82cbc50a56dc22f9aafc554da2ea632e33bee1d33c35edb13269ba0fd2fa791744e86eda7fc1cb15433f1232f86a42afcd5470215ccf0d05096ce1b8f075e6dc45df74896345297fcc145a4765aeaea78babaa6441ead3a2e73b37931dc7c07d4e04b7115284c7c04c85a61c7e555194d0f4ee762d47a8aeec2efcd75ee45e3e6a65f876f9a67aa01016f3ce9552d8f0b50cc150c70333aa6ac3a4ac8860d2879cad8439566f0ffda32612cb75dd9c1b456a4e1828582f05932f495452f19d71f300f2f48b8c1f8cde1b1b8d8ada3f6ff506e10d5d18d91d61402bc36756a88196381ff795980eee932a179525264e3a968f0abe9edbe672560c41833a";
		BigInteger c2 = new BigInteger(c_2,16);
		BigInteger aeskey = new BigInteger(aes_k,16);
		String modulus ="E85242770A66698C6449615AD48F70E5FF7F49CA4533437D85367E1AF38F31AA35948EB33F9788F7164A1DD5C3875BF86B693BD8CC82E2CBCBD01CF7D1B451EF67CB7290FA790EE10224E3725B37B6BC3D5356DA9D0FBAC1E06BB26FF24303D906D3C966C81B199A78B9EF022B0FB928E582FC0CE02957F6B1642101F92E834AAB47249EE408C291D3FCE872C14469123137F4DA492800750336472069F4E24B4A0E3EE51585AE786843A3C03961C212A1E394D271E82614C4E7AA1D5DA416011F9B4081A8E47065751ADEDE51D09097FB8A41ACBE2E545CB6D404401D5916C3F68616E96679B35F7774A9E442B1987414B022EE06F00FAC3DDDB6141943E553";
		BigInteger n = new BigInteger(modulus,16); 		
		String o = "1";
		BigInteger one = new BigInteger(o,10);				
		BigInteger diff=c1.subtract(c2);		
		BigInteger gcd = diff.gcd(n);		
		BigInteger q=n.divide(gcd);			
	    BigInteger q_1=q.subtract(one);
  	 BigInteger p_1=gcd.subtract(one);
	 BigInteger totient=p_1.multiply(q_1);	 
	 String exp = "65537";
	 BigInteger e= new BigInteger(exp,10);
	 BigInteger d=e.modInverse(totient);
	 BigInteger key= aeskey.modPow(d,n);
	 String aes_key=key.toString(16);
	 System.out.println(aes_key);
	
		
	}
}