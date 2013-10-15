/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev;

import benchmark.testdriver.TestDriver ;

public class RunPerf {
    public static void main(String argv[]) {
        //String set = "1m" ;
        //String set = "5m" ;
        String set = "25m" ;
        //String abase = "tdb" ;
        //String abase = "quack" ;
        String abase = "quack2" ;
        TestDriver.main(
                        //"-runs", "2", "-w", "2",
                        "-runs", "150", "-w", "20",
                        "-idir", "Data/data-"+set, "-o", "res-"+set+".xml",
                        "jena:TDB-DB/DB-"+set+"/assembler-"+abase+".ttl"
                        //"http://localhost:3030/ds/sparql"
                        ) ;
        
        //benchmark.tools.ResultTransform.main("Results");
    }
}

