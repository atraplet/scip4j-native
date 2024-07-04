package com.ustermetrics.scip4j_native;

import org.junit.jupiter.api.Test;
import org.scijava.nativelib.NativeLoader;

import java.io.IOException;

class LoadLibraryTest {

    @Test
    void loadLibrary() throws IOException {
        NativeLoader.loadLibrary("tbb");
        NativeLoader.loadLibrary("scip");
    }

}
