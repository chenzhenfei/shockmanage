package com.shock.psm.utils;

import org.apache.commons.lang3.StringUtils;

public class PathUtils {
	/**
	 * ��ȡ��classesĿ¼
	 * 
	 * @return path
	 */
	public static String getClassPath() {
		String systemName = System.getProperty("os.name");

		// �жϵ�ǰ�����������Windows Ҫ��ȡ·���ĵ�һ�� '/'
		if (!StringUtils.isBlank(systemName)
				&& systemName.indexOf("Windows") != -1) {
			return PathUtils.class.getResource("/").getFile().toString()
					.substring(1);
		} else {
			return PathUtils.class.getResource("/").getFile().toString();
		}
	}

	/**
	 * ��ȡ��ǰ�����·��
	 * 
	 * @param object
	 * @return path
	 */
	public static String getObjectPath(Object object) {
		return object.getClass().getResource(".").getFile().toString();
	}

	/**
	 * ��ȡ����Ŀ��·��
	 * 
	 * @return path
	 */
	public static String getProjectPath() {
		return System.getProperty("user.dir");
	}

	/**
	 * ��ȡ rootĿ¼
	 * 
	 * @return path
	 */
	public static String getRootPath() {
		return getWEB_INF().replace("WEB-INF/", "");
	}

	/**
	 * ��ȡ���HTMLĿ¼
	 * 
	 * @return
	 */
	public static String getHTMLPath() {
		return getFreePath() + "html/html/";
	}

	/**
	 * ��ȡ���FTLĿ¼
	 * 
	 * @return
	 */
	public static String getFTLPath() {
		return getFreePath() + "html/ftl/";
	}

	/**
	 * ��ȡ web-infĿ¼
	 * 
	 * @return path
	 */
	public static String getWEB_INF() {
		return getClassPath().replace("classes/", "");
	}

	/**
	 * ��ȡģ���ļ���·��
	 * 
	 * @return path
	 */
	public static String getFreePath() {
		return getWEB_INF() + "ftl/";
	}

	/**
	 * �ı����У���ΪLinux �� Windows �Ļ��з���һ��
	 * 
	 * @return
	 */
	public static String nextLine() {
		String nextLine = System.getProperty("line.separator");
		return nextLine;
	}

	/**
	 * ��ȡimages ·��
	 * 
	 * @return
	 */
	public static String getImages() {
		return getRootPath() + "images/";
	}

	/**
	 * ��ȡsitemap ·��
	 * 
	 * @return
	 */
	public static String getSiteMapPath() {
		return getRootPath() + "txt/sitemap";
	}

	/**
	 * ��ȡTxt ·��
	 * 
	 * @return
	 */
	public static String getTxt() {
		return getRootPath() + "txt";
	}

}
