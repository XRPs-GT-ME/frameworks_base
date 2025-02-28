/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// This file is generated by generate_java.py do not directly modify!
package android.libcore.varhandles;

import android.perftests.utils.BenchmarkState;
import android.perftests.utils.PerfStatusReporter;

import androidx.test.filters.LargeTest;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ReflectSetFieldLittleEndianIntPerfTest {
    @Rule public PerfStatusReporter mPerfStatusReporter = new PerfStatusReporter();
    Field mField;
    int mValue;

    public ReflectSetFieldLittleEndianIntPerfTest() throws Throwable {
        mField = this.getClass().getDeclaredField("mValue");
    }

    @Test
    public void run() throws Throwable {
        BenchmarkState state = mPerfStatusReporter.getBenchmarkState();
        while (state.keepRunning()) {
            mField.setInt(this, 42);
            mField.setInt(this, 42);
        }
    }
}
