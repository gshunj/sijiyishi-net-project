package com.sijiyishi.qiniu;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.qiniu.storage.model.FileInfo;
import com.qiniu.storage.model.FileListing;
import com.sijiyishi.qiniu.beans.enums.BucketEnum;
import com.sijiyishi.qiniu.beans.sijiyishi2qiniu.request.ListURLRequest;

/**
 * @author 作者 jgshun
 * @version 创建时间：2016-7-15 下午1:02:46 类说明
 */

public class QiniuUtilTest extends TestCase {
	public void test() throws IOException {
		ListURLRequest listURLRequest = new ListURLRequest();
		listURLRequest.setBucket(BucketEnum.VIDEO);
		listURLRequest.setPrefix("audio");
		// 获取列表
		FileListing fileListing = QiniuUtil.getFileListing(listURLRequest);

		List<String> keys = new ArrayList<String>();
		for (FileInfo _FileInfo : fileListing.items) {
			keys.add(_FileInfo.key);
		}

		// 移动资源
		QiniuUtil.move(BucketEnum.AUDIO, BucketEnum.VIDEO, keys);
	}

	public byte[] getByte(String filename) throws IOException {
		File file = new File(filename);

		BufferedInputStream in = new BufferedInputStream(new FileInputStream(
				file));
		ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
		System.out.println("Available bytes:" + in.available());
		byte[] temp = new byte[1024];
		int size = 0;
		while ((size = in.read(temp)) != -1) {
			out.write(temp, 0, size);
		}
		in.close();
		byte[] content = out.toByteArray();
		System.out.println("Readed bytes count:" + content.length);
		return content;
	}

}
