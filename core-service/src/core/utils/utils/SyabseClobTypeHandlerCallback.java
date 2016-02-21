package core.utils.utils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class SyabseClobTypeHandlerCallback implements TypeHandler {

	@Override
	public Object getResult(ResultSet arg0, String arg1) throws SQLException {
		return null;
	}

	@Override
	public Object getResult(ResultSet arg0, int arg1) throws SQLException {
		
		return null;
	}

	@Override
	public Object getResult(CallableStatement arg0, int arg1) throws SQLException {
		return null;
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, Object arg2,JdbcType arg3) throws SQLException {
		
	}

	

}