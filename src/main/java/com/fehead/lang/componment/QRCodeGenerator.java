package com.fehead.lang.componment;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.springframework.stereotype.Component;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author lmwis
 * @Date 2019-10-22 18:41
 * @Version 1.0
 */
@Component
public class QRCodeGenerator {

    private static final int BLACK = 0xFF000000;
    private static final int WHITE = 0xFFFFFFFF;

    private int weigth = 300;

    private int height = 300;

    public BufferedImage generateQRCode(String content) throws WriterException {

        Map hints = new HashMap<>();
        // 可支持中文
        hints.put(EncodeHintType.CHARACTER_SET,"utf-8");
        // 纠错等级默认为m 15%纠错
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        // 白色边框，默认为5
        hints.put(EncodeHintType.MARGIN,2);

        BitMatrix encode = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, weigth, height, hints);

        return toBufferedImage(encode);
//        ImageIO.write(bufferedImage, "png", new File("D:\\311\\result1.png"));
    }

    private BufferedImage toBufferedImage(BitMatrix matrix) {
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, matrix.get(x, y) ? BLACK : WHITE);
            }
        }
        return image;
    }
}
