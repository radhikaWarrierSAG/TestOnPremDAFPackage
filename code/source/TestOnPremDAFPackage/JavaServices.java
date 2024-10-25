package TestOnPremDAFPackage;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class JavaServices

{
	// ---( internal utility methods )---

	final static JavaServices _instance = new JavaServices();

	static JavaServices _newInstance() { return new JavaServices(); }

	static JavaServices _cast(Object o) { return (JavaServices)o; }

	// ---( server methods )---




	public static final void multiConcat (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(multiConcat)>> ---
		// @sigtype java 3.5
		// [i] field:0:optional string1
		// [i] field:0:optional string2
		// [i] field:0:optional string3
		// [i] field:0:optional string4
		// [i] field:0:optional string5
		// [o] field:0:optional outputString
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	string1 = IDataUtil.getString( pipelineCursor, "string1" );
			String	string2 = IDataUtil.getString( pipelineCursor, "string2" );
			String	string3 = IDataUtil.getString( pipelineCursor, "string3" );
			String	string4 = IDataUtil.getString( pipelineCursor, "string4" );
			String	string5 = IDataUtil.getString( pipelineCursor, "string5" );
			String outputString ="";
			if(!"".equals(string1) && string1 != null){
				outputString = outputString+string1;
			}
			if(!"".equals(string2) && string2 != null){
				outputString = outputString+string2;
			}
			if(!"".equals(string3) && string3 != null){
				outputString = outputString+string3;
			}
			if(!"".equals(string4) && string4 != null){
				outputString = outputString+string4;
			}
			if(!"".equals(string5) && string5 != null){
				outputString = outputString+string5;
			}
			
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "outputString", outputString );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

