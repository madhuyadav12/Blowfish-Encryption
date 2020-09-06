package com.ksh2.crypt;



import java.security.KeyException;
import java.security.Security;
import java.security.Key;
import java.security.KeyException;
import java.io.IOException;

 public interface BlowCipher{
  
    public void engineInitEncrypt (BlowKey key)
	throws KeyException; 
    public void engineInitDecrypt (BlowKey key)
	throws KeyException ;
    public int engineUpdate (byte[] in, int inOff, int inLen, byte[] out, int outOff);
}

