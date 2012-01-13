// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import java.util.logging.*;
public class XGCValues extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 128; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	XGCValues(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	XGCValues() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public int get_function() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_function(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public long get_plane_mask() { log.finest("");return (Native.getLong(pData+8)); }
	public void set_plane_mask(long v) { log.finest(""); Native.putLong(pData+8, v); }
	public long get_foreground() { log.finest("");return (Native.getLong(pData+16)); }
	public void set_foreground(long v) { log.finest(""); Native.putLong(pData+16, v); }
	public long get_background() { log.finest("");return (Native.getLong(pData+24)); }
	public void set_background(long v) { log.finest(""); Native.putLong(pData+24, v); }
	public int get_line_width() { log.finest("");return (Native.getInt(pData+32)); }
	public void set_line_width(int v) { log.finest(""); Native.putInt(pData+32, v); }
	public int get_line_style() { log.finest("");return (Native.getInt(pData+36)); }
	public void set_line_style(int v) { log.finest(""); Native.putInt(pData+36, v); }
	public int get_cap_style() { log.finest("");return (Native.getInt(pData+40)); }
	public void set_cap_style(int v) { log.finest(""); Native.putInt(pData+40, v); }
	public int get_join_style() { log.finest("");return (Native.getInt(pData+44)); }
	public void set_join_style(int v) { log.finest(""); Native.putInt(pData+44, v); }
	public int get_fill_style() { log.finest("");return (Native.getInt(pData+48)); }
	public void set_fill_style(int v) { log.finest(""); Native.putInt(pData+48, v); }
	public int get_fill_rule() { log.finest("");return (Native.getInt(pData+52)); }
	public void set_fill_rule(int v) { log.finest(""); Native.putInt(pData+52, v); }
	public int get_arc_mode() { log.finest("");return (Native.getInt(pData+56)); }
	public void set_arc_mode(int v) { log.finest(""); Native.putInt(pData+56, v); }
	public long get_tile() { log.finest("");return (Native.getLong(pData+64)); }
	public void set_tile(long v) { log.finest(""); Native.putLong(pData+64, v); }
	public long get_stipple() { log.finest("");return (Native.getLong(pData+72)); }
	public void set_stipple(long v) { log.finest(""); Native.putLong(pData+72, v); }
	public int get_ts_x_origin() { log.finest("");return (Native.getInt(pData+80)); }
	public void set_ts_x_origin(int v) { log.finest(""); Native.putInt(pData+80, v); }
	public int get_ts_y_origin() { log.finest("");return (Native.getInt(pData+84)); }
	public void set_ts_y_origin(int v) { log.finest(""); Native.putInt(pData+84, v); }
	public long get_font() { log.finest("");return (Native.getLong(pData+88)); }
	public void set_font(long v) { log.finest(""); Native.putLong(pData+88, v); }
	public int get_subwindow_mode() { log.finest("");return (Native.getInt(pData+96)); }
	public void set_subwindow_mode(int v) { log.finest(""); Native.putInt(pData+96, v); }
	public boolean get_graphics_exposures() { log.finest("");return (Native.getBool(pData+100)); }
	public void set_graphics_exposures(boolean v) { log.finest(""); Native.putBool(pData+100, v); }
	public int get_clip_x_origin() { log.finest("");return (Native.getInt(pData+104)); }
	public void set_clip_x_origin(int v) { log.finest(""); Native.putInt(pData+104, v); }
	public int get_clip_y_origin() { log.finest("");return (Native.getInt(pData+108)); }
	public void set_clip_y_origin(int v) { log.finest(""); Native.putInt(pData+108, v); }
	public long get_clip_mask() { log.finest("");return (Native.getLong(pData+112)); }
	public void set_clip_mask(long v) { log.finest(""); Native.putLong(pData+112, v); }
	public int get_dash_offset() { log.finest("");return (Native.getInt(pData+120)); }
	public void set_dash_offset(int v) { log.finest(""); Native.putInt(pData+120, v); }
	public byte get_dashes() { log.finest("");return (Native.getByte(pData+124)); }
	public void set_dashes(byte v) { log.finest(""); Native.putByte(pData+124, v); }


	String getName() {
		return "XGCValues"; 
	}


	String getFieldsAsString() {
		String ret="";

		ret += ""+"function = " + get_function() +", ";
		ret += ""+"plane_mask = " + get_plane_mask() +", ";
		ret += ""+"foreground = " + get_foreground() +", ";
		ret += ""+"background = " + get_background() +", ";
		ret += ""+"line_width = " + get_line_width() +", ";
		ret += ""+"line_style = " + get_line_style() +", ";
		ret += ""+"cap_style = " + get_cap_style() +", ";
		ret += ""+"join_style = " + get_join_style() +", ";
		ret += ""+"fill_style = " + get_fill_style() +", ";
		ret += ""+"fill_rule = " + get_fill_rule() +", ";
		ret += ""+"arc_mode = " + get_arc_mode() +", ";
		ret += ""+"tile = " + get_tile() +", ";
		ret += ""+"stipple = " + get_stipple() +", ";
		ret += ""+"ts_x_origin = " + get_ts_x_origin() +", ";
		ret += ""+"ts_y_origin = " + get_ts_y_origin() +", ";
		ret += ""+"font = " + get_font() +", ";
		ret += ""+"subwindow_mode = " + get_subwindow_mode() +", ";
		ret += ""+"graphics_exposures = " + get_graphics_exposures() +", ";
		ret += ""+"clip_x_origin = " + get_clip_x_origin() +", ";
		ret += ""+"clip_y_origin = " + get_clip_y_origin() +", ";
		ret += ""+"clip_mask = " + get_clip_mask() +", ";
		ret += ""+"dash_offset = " + get_dash_offset() +", ";
		ret += ""+"dashes = " + get_dashes() +", ";
		return ret;
	}


}


