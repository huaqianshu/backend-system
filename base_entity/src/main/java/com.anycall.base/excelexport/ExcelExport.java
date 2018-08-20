//package com.anycall.base.excelexport;
//
//import com.anycall.base.common.Constants;
//import net.sf.jxls.transformer.XLSTransformer;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.springframework.web.servlet.view.document.AbstractXlsxView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.util.Map;
//
///**
// * Created by Amy on 2017/2/28.
// */
//
//public class ExcelExport extends AbstractXlsxView {
//    private String downLoadFileName;
//    private Map<String,Object> paramsMap;
//    private InputStream inputStream;
//
//    public ExcelExport(String downLoadFileName, Map<String, Object> paramsMap, InputStream inputStream) {
//        this.downLoadFileName = downLoadFileName;
//        this.paramsMap = paramsMap;
//        this.inputStream = inputStream;
//    }
//
//    public void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception{
//        XLSTransformer xlsTransformer = new XLSTransformer();
//        workbook = xlsTransformer.transformXLS(inputStream, paramsMap);
//        response.setContentType(Constants.HttpHeader.CONTENT_TYPE_EXCEL);
//        response.setHeader(Constants.HttpHeader.CONTENT_DISPOSITION, Constants.HttpHeader.CONTENT_DISPOSITION_ATTACHMENT + downLoadFileName);
//        OutputStream outputStream = response.getOutputStream();
//        workbook.write(outputStream);
//        outputStream.flush();
//        outputStream.close();
//    }
//
//    public String getDownLoadFileName() {
//        return downLoadFileName;
//    }
//
//    public void setDownLoadFileName(String downLoadFileName) {
//        this.downLoadFileName = downLoadFileName;
//    }
//
//    public Map<String, Object> getParamsMap() {
//        return paramsMap;
//    }
//
//    public void setParamsMap(Map<String, Object> paramsMap) {
//        this.paramsMap = paramsMap;
//    }
//
//    public InputStream getInputStream() {
//        return inputStream;
//    }
//
//    public void setInputStream(InputStream inputStream) {
//        this.inputStream = inputStream;
//    }
//}
