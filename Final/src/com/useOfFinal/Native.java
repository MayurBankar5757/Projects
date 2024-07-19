package com.useOfFinal;

public class Native {
	public class NativeExample  {
	    // Native method declaration
	    public native void doSomethingNative();

	    // Loading the native library
	    static {
	        System.loadLibrary("NativeLibrary");
	    }

	    public static void main(String[] args) {
	        NativeExample example = new NativeExample();
	        example.doSomethingNative(); // This method's actual implementation is in a native library
	    }
	}

}
