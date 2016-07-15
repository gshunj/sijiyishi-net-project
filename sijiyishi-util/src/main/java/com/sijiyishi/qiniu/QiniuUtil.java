package com.sijiyishi.qiniu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.FileListing;
import com.qiniu.util.Auth;
import com.qiniu.util.Json;
import com.qiniu.util.StringMap;
import com.sijiyishi.qiniu.beans.enums.BucketEnum;
import com.sijiyishi.qiniu.beans.sijiyishi2qiniu.request.ListURLRequest;

/**
 * @author 作者 jgshun
 * @version 创建时间：2016-7-15 下午1:02:46 类说明
 */
public class QiniuUtil {
	private static final Logger _LOGGER = LoggerFactory
			.getLogger(QiniuUtil.class);

	private static final String ACCESS_KEY = "S5ZTrjpgBuONJK9jvXAPMQgMd78jdHtXUpjbNxxu";
	private static final String SECRET_KEY = "hGDP7yv3ViljxnTQ-6jmdlMLPflMC_ITuI5x51L6";

	/**
	 * 批量移动
	 * 
	 * @param toBucket
	 *            移动目的
	 * @param fromBucket
	 *            移动源
	 * @param keysOfFromBucket
	 *            移动源中的key列表
	 * @throws QiniuException
	 */
	public static void move(BucketEnum toBucket, BucketEnum fromBucket,
			List<String> keysOfFromBucket) throws QiniuException {
		// 创建Batch类型的operations对象
		BucketManager.Batch operations = new BucketManager.Batch();
		for (String _KeyOfFromBucket : keysOfFromBucket) {
			operations.move(fromBucket.getValue(), _KeyOfFromBucket,
					toBucket.getValue(), _KeyOfFromBucket);
		}
		// 调用批量操作的batch方法
		Response res = createBucketManager().batch(operations);
		_LOGGER.info("批量转移结束:" + res);
	}

	public static FileListing getFileListing(ListURLRequest listURLRequest)
			throws QiniuException {
		FileListing fileListing = createBucketManager().listFiles(
				listURLRequest.getBucket().getValue(),
				listURLRequest.getPrefix(), listURLRequest.getMarker(),
				listURLRequest.getLimit(), listURLRequest.getDelimiter());
		// FileInfo[] items = fileListing.items;
		// for(FileInfo fileInfo:items){
		// System.out.println(fileInfo.key);
		// }
		return fileListing;
	}

	/**
	 * 上传到七牛，返回外部链接
	 * 
	 * @param bytes
	 * @param bucket
	 * @return
	 */
	public static String upload(byte[] bytes, BucketEnum bucket) {
		UploadManager uploadManager = new UploadManager();
		String url = null;

		String key = createKey(bucket);

		// 获取token
		String token = getToken(bucket);
		// 上传到七牛
		try {
			Response r = uploadManager.put(bytes, key, token);
			if (r.statusCode == 200) {
				StringMap json = Json.decode(r.bodyString());
				url = (String) json.get("key");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return url;
	}

	/**
	 * @param bucket
	 * @return
	 */
	private static String createKey(BucketEnum bucketEnum) {
		return "img/test/111.jpg";
	}

	public static BucketManager createBucketManager() {
		// 实例化一个BucketManager对象
		BucketManager bucketManager = new BucketManager(createAuth());
		return bucketManager;
	}

	public static Auth createAuth() {
		Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
		return auth;
	}

	public static String getToken(BucketEnum bucket) {
		String token = createAuth().uploadToken(bucket.getValue());
		// 覆盖上传，题目相关图片时用到，String token = auth.uploadToken(bucket, key);
		return token;
	}

	/**
	 * 除去数组中的空值并给值上加上双引号
	 * 
	 * @param sArray
	 *            签名参数组
	 * @return 去掉空值参数组
	 */
	public static Map<String, String> paraFilterRemoveEmptyAndAddDoubleQuotationMarks(
			Map<String, String> sArray) {
		Map<String, String> result = new HashMap<String, String>();
		if (sArray == null || sArray.size() <= 0) {
			return result;
		}

		for (String key : sArray.keySet()) {
			String value = sArray.get(key);
			if (value == null || value.equals("")) {
				continue;
			}
			StringBuilder valBud = new StringBuilder("\"");
			valBud.append(value).append("\"");
			result.put(key, valBud.toString());
		}

		return result;
	}

	/**
	 * 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
	 * 
	 * @param params
	 *            需要排序并参与字符拼接的参数组
	 * @return 拼接后字符串
	 */
	public static String createLinkString(Map<String, String> params) {

		List<String> keys = new ArrayList<String>(params.keySet());
		Collections.sort(keys);

		String prestr = "";

		for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			String value = params.get(key);

			if (i == keys.size() - 1) {// 拼接时，不包括最后一个&字符
				prestr = prestr + key + "=" + value;
			} else {
				prestr = prestr + key + "=" + value + "&";
			}
		}

		return prestr;
	}

}
