/**********************************************************************************
 * $URL: https://source.sakaiproject.org/contrib/rsmart/dbrefactor/alias/alias-impl/impl/src/java/org/sakaiproject/alias/impl/AliasServiceSqlDefault.java $
 * $Id: AliasServiceSqlDefault.java 3560 2007-02-19 22:08:01Z jbush@rsmart.com $
 ***********************************************************************************
 *
 * Copyright (c) 2004, 2005, 2006 The Sakai Foundation.
 *
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/ecl1.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/
package org.sakaiproject.alias.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.sakaiproject.alias.api.AliasServiceSql;



/**
 * methods for accessing alias data in a database.
 */
public class AliasServiceSqlDefault implements AliasServiceSql {

   // logger
   protected final transient Log logger = LogFactory.getLog(getClass());

   /**
    * return the sql statement which deletes a specified alias from the chef_alias table.
    * <br/><br/>
    * @return the sql statement which deletes a specified alias from the chef_alias table.
    */
   public String getDeleteAliasSql() {
      return "delete from CHEF_ALIAS where ALIAS_ID = ?";
   }

   /**
    * return the sql statement which retrieves all of the alias' from the chef_alias table.
    * <br/><br/>
    * @return the sql statement which retrieves all of the alias' from the chef_alias table.
    */
   public String getListAliasesSql() {
      return "select ALIAS_ID, XML from CHEF_ALIAS";
   }
}
