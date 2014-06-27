/*
 *
 *  * Copyright 2010-2014 Orient Technologies LTD (info(at)orientechnologies.com)
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.orientechnologies.orient.etl.loader;

import com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx;
import com.orientechnologies.orient.core.record.impl.ODocument;

/**
 * ETL Loader.
 */
public class OOrientLoader implements OLoader {
  protected ODatabaseDocumentTx db;
  protected long                progress = 0;

  public OOrientLoader() {
  }

  public void load(final Object input) {
    progress++;
  }

  public long getProgress() {
    return progress;
  }

  @Override
  public void configure(ODatabaseDocumentTx iDatabase, ODocument iConfiguration) {
    this.db = iDatabase;
  }

  @Override
  public String getName() {
    return "orient";
  }
}