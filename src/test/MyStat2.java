/*
*	New Java File starts here.
*	This file should be named MyStat2.java
*	Automatically generated by NML CodeGen Java Applet.
*	from nml_test_format.hh:64
*	with command line arguments :  generate_for_all_langs=true HHFile=nml_test_format.hh
*
*	.gen script :
*		0:load nml_test_format.hh
*		1:clear
*		2:select_from_file nml_test_format.hh
*		3:generate C protos>nml_test_format_c_n.h
*		4:generate C format>nml_test_format_c_n.c
*		5:generate C update>nml_test_format_c_n.c
*		6:generate C++ protos>nml_test_format_n_codegen_protos.hh
*		7:generate C++ format>nml_test_format_n.cc
*		8:generate C++ update>nml_test_format_n.cc
*		9:generate C++ constructor>nml_test_format_n.cc
*		10:generate Java dict>nml_test_format_MsgDict.java
*		11:generate Java classes >*
*		12:generate Ada spec>nml_test_format_n_ada.ads
*		13:generate Ada body>nml_test_format_n_ada.adb
*		14:exit
*
*/

// Import all NML and posemath interfaces
import rcs.nml.*;
import rcs.posemath.*;

/*
*	Class definition for MyStat2
*	Automatically generated by NML CodeGen Java Applet.
*/
public class MyStat2 extends RCS_STAT_MSG_V2 implements Cloneable
{


	// Constructor 
	public MyStat2()
	{
		super(2002);

	}



	// Constructor that should be used by any classes that extend this class. 
	protected MyStat2(int _type)
	{
		super(_type);

	}


	public void update(NMLFormatConverter nml_fc)
	{

		nml_fc.beginClass("MyStat2","RCS_STAT_MSG_V2");

		nml_fc.beginBaseClass("RCS_STAT_MSG_V2");

		super.update(nml_fc);

		nml_fc.endBaseClass("RCS_STAT_MSG_V2");

		nml_fc.endClass("MyStat2","RCS_STAT_MSG_V2");

	}


	public MyStat2 clone() throws CloneNotSupportedException
	{
		MyStat2 cloned_object = (MyStat2) super.clone();
		return cloned_object;

	}


	/* Getters and Setters */

}

