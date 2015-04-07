//package com.orange.paddock.abfw.consumer.upe.client.pap;
//
//import junit.framework.Assert;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//
//import com.orange.paddock.abfw.consumer.upe.client.PAPClient;
//import com.orange.paddock.abfw.consumer.upe.client.exception.PAPClientException;
//
//
//@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:applicationContext-pap-test.xml" })
//public class TestPAP {
//	
//	@Autowired
//	private PAPClient papClient;
//	
//	private final String PAP_ID="abfw-064232101";
//	private final String PAP_NAME="Sam";
//	private final String PAP_LOGO="http://2.bp.blogspot.com/-ot4eLEDWAjs/Uk9fzDJlQCI/AAAAAAAAKsU/UfUhYvEvAz4/s1600/Recherche-image-b%C3%A9b%C3%A9-80.jpg";
//	
//	@Test
//	public void testPapClient(){
//		String response=null;
//		try{
//		response=papClient.addpartener(PAP_ID,PAP_NAME,PAP_LOGO);
//		Assert.assertEquals("SUCCEED", response);}
//		catch(PAPClientException e){
//			System.out.println(e.ErrorDescription);
//			Assert.assertEquals("The specified incoming third party service already exists",e.ErrorDescription);
//		
//	}}
//	
//
//}
