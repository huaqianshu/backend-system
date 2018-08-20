//package com.anycall.base.excelexport;
//
//import com.anycall.base.common.Constants;
//import com.anycall.base.model.finance.bo.ExcelExportBo;
//import net.sf.jxls.transformer.XLSTransformer;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.springframework.web.servlet.view.document.AbstractXlsxView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by Amy on 2017/3/1.
// */
//public class MultipleExcelExport extends AbstractXlsxView {
//    private String downLoadFileName;
//    private List<ExcelExportBo> paramsList;
//    private InputStream inputStream;
//    private List<String> steetNames;
//
//    public MultipleExcelExport(String downLoadFileName, List<ExcelExportBo> paramsList, InputStream inputStream, List<String> steetNames) {
//        this.downLoadFileName = downLoadFileName;
//        this.paramsList = paramsList;
//        this.inputStream = inputStream;
//        this.steetNames = steetNames;
//    }
//
//    public void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception{
//        XLSTransformer xlsTransformer = new XLSTransformer();
//        workbook = xlsTransformer.transformMultipleSheetsList(inputStream, paramsList, steetNames,"list", new HashMap<>(), 0);
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
//    public InputStream getInputStream() {
//        return inputStream;
//    }
//
//    public void setInputStream(InputStream inputStream) {
//        this.inputStream = inputStream;
//    }
//
//    public List<String> getSteetNames() {
//        return steetNames;
//    }
//
//    public void setSteetNames(List<String> steetNames) {
//        this.steetNames = steetNames;
//    }
//
//    public List<ExcelExportBo> getParamsList() {
//        return paramsList;
//    }
//
//    public void setParamsList(List<ExcelExportBo> paramsList) {
//        this.paramsList = paramsList;
//    }
//}
