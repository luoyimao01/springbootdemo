/**
 *	create by tools 2019-1-15 17:16:58
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimIdmMonitorType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimIdmMonitorType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_idm_monitor_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimIdmMonitorType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_MONITORTYPEID = "monitorTypeId";
	public static final String FIELD_MONITORTYPENAME = "monitorTypeName";

	@Column(name="monitor_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String monitorTypeId;

	@Column(name="monitor_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String monitorTypeName;

	public String getMonitorTypeId(){

			return this.monitorTypeId;
	}

	public void setMonitorTypeId(String monitorTypeId){
		this.monitorTypeId=monitorTypeId;
	}

	public String getMonitorTypeName(){

			return this.monitorTypeName;
	}

	public void setMonitorTypeName(String monitorTypeName){
		this.monitorTypeName=monitorTypeName;
	}

}
