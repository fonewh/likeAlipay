package com.yzf.utils;

public class AlipayConfig {

	public static String app_id = "2021000116682436";//�ں�̨��ȡ���������ã�
	
	public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCq/bS2G0cip8/E61ahjJuX8wX8j/aW9LLi5XnJ7Oy9oUd8YM+MZoijxpgPkw0cnwjL1uav7tIg3Rnf7D18yhvsOGPgHejWd10pB10/C7jC3z70GEiKCeO3GRGiKx3tv8Iy75ks1R4v9XBdzaxKjwKwEjuO8eEznVjYQ76ZVNXTcLYvek14rNB4sR+Dr3hYGZl+Hxryk3SsfKTX1uDA5QFnLes0FQFySxCJ5cGa0nkbyVvG7SIuMpyIowdgawTXLfWeYy0XZ1OHB2eauVQTmueaSGVpiMEDwk7xVu3S9DMk3HIN3eBoCd4zl658O4Tyfj05cy1LvAgJYpDp8TpbkCytAgMBAAECggEAVyX7hp0cgmM5F8pCWxAI9UbdlD3jlkidK9t9WRcyCew7PP8yiQJxPdeoBLgUBLRhjVK4PI7h9fH6kBAdvo5b8OdEsCNOWpB3oMOqGMnmnxudQFdoEUK9FsLmI9sJ4/TKC5/mV90/B352iLicyVteKVMBm/dXqjDV6VONvyRn3t1MByK87tgchS3saQks7UTuQEqoNRlTfJBPQnGJ3hPXm6N0lkpPpoMv75v8rBv52A0QkOhOSxEt7em6AIKWueCkTNPSGbQLgmkJ4v6Op4+bvPS/Y3eGVS58RnKaA5U98QKwvf+ERN/XkG/C0Ixwz6UtbVUbN2a2hDetwn5NoErLGQKBgQDWlDsqv4oN1AQBvnAO/cCqGyovGW4mnzQFUVkIyELMigc/RNlP2dF35xHXs7i4AgEK9/uBry6COu3gRA7VOHm8p6h03wfkTeamtBGnS7/vf4+709qfsUZ0D24YetDeXaOL5X575dV6no/24OUdAr0Gl4GhdGnE9pa+sVFm0vWfSwKBgQDL/4EERNDRxyGRyLMkM/dTzxtsJiTbGtnUpdzcte0yEBBd9fSZ2Hb4vTlTCibYWo2uAWINPaTzmzIIumBUnoJzI6QGxEYx0GJ21XP9e+K7D/EVbw+W/juGmYGzQKFB/7u6opGfLs1FdaxhgTFkjF2GQoUfxZY+g4UYk8wb9LJQ5wKBgG2r5XG74/udWU7q3qtK1qYarDzWao4i4Ju3MCJk+H9CLOIRdmBxm7YEzAHLQaYKoC3TASEPQF4fcGUnY81myBG8P0U8mPP/PNwHPN6cwMTQFc6SQTNNkAzRthuc6hQ9F9HwwezhU3MQh9ROrcteEu7DkOXMciLRRcrBJjG/sPpxAoGAYkfoinv09vwvCiNdWzXGFJSVK5d87iqTg8WdEKB9dD8VA4+5ll0ZhGD1uzIK4PVPiOOVr7dhPxQoGNhiDKKJSpuDLNdm0h0JMyNHTHphE6pshd0J777wQrq2J/wdNMTWVuZ3re9Iagx1TkyF1WFitYpaxKHW7qtCdkLOdTGAr0UCgYA0aDl4F9vh7S0jaPIcQcpqOKJCGWG3txUlfCeNNXznrpbFw9LadZ2S67v8x9bMq/MmDnmBzzw3mgF88Wynba/dPL5qOfks3VtlSv6eug3Ym3XVWV8CkjPTw4z0+hBIRMoBCzSKPvIIGj9h9JmVDpS2Teutgw4+Wks9GWwBW4DOkQ==";//�̳̲鿴��ȡ��ʽ���������ã�

	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtJTfh10tNtGgmoJiyCKD+Mod4T1lUmi8D4Kp8yKHtKhlwyF5OqmRSE+RT1nUtkM/MlTvjjUqBkl2EI4mHlqUkBkYigECO/SoDQV2WpyAlakXVRMbhAvFKhTS/655lZrbJnqCpeu0JcaY08QN4q14g1aWNTZqRLfobdbDDUn5lIQk9v/68h8snxaUddIBu00kFl69sDon1PR3nL1czcmawJPDKpByzpo2kPpTlBXu34Lzhi4hXEBdtsF2OBCVUtCnXqE0W7P7E6XDRg1Q1ZzZ1bJA94LwJdnSdib4vE8xSgWn9goi0MRspFEIItJ3w/qULJJ9ya2ACkvNaG2V+k2gLwIDAQAB";//�̳̲鿴��ȡ��ʽ���������ã�
	
	public static String notify_url = "http://10.0.79.162:8081/alipay/alipayNotifyNotice.action";
	
	public static String return_url = "http://10.0.79.162:8081/alipay/alipayReturnNotice.action";//http://10.0.79.162:8081/alipay/alipayReturnNotice.action
	
	public static String sign_type = "RSA2";
	
	public static String charset = "utf-8";
	
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//ע�⣺ɳ����Ի�������ʽ����Ϊ��https://openapi.alipay.com/gateway.do
}
