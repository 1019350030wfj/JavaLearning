package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CameraPreviewSize {

    //    public static void main(String[] args) {
//        List<Size> allFitPreviewSizes = new ArrayList<>();
//        allFitPreviewSizes.add(new Size(1920, 1080));
//        allFitPreviewSizes.add(new Size(1280, 960));
//        allFitPreviewSizes.add(new Size(1280, 720));
//        allFitPreviewSizes.add(new Size(1440, 1080));
//        allFitPreviewSizes.add(new Size(320, 240));
//        allFitPreviewSizes.add(new Size(720, 480));
//        allFitPreviewSizes.add(new Size(640, 480));
//        allFitPreviewSizes.add(new Size(3264, 2448));
//        allFitPreviewSizes.add(new Size(2560, 1920));
//        choosePreviewSize(allFitPreviewSizes);
//    }
    public static void main(String[] args) {
        List<Size> allFitPreviewSizes = new ArrayList<>();
        allFitPreviewSizes.add(new Size(1920, 1080));
        allFitPreviewSizes.add(new Size(960, 540));
        allFitPreviewSizes.add(new Size(1280, 720));
        allFitPreviewSizes.add(new Size(1280, 960));
        allFitPreviewSizes.add(new Size(1440, 1080));
//        allFitPreviewSizes.add(new Size(640, 480));
//        allFitPreviewSizes.add(new Size(3264, 2448));
//        allFitPreviewSizes.add(new Size(2560, 1920));
        choosePreviewSize(allFitPreviewSizes);
    }

    public static void choosePreviewSize(List<Size> allFitPreviewSizes) {
        double realSizeRatio = 1.777777778;
        Size optimalSize = Collections.max(allFitPreviewSizes, (sizeA, sizeB) -> {
            boolean ratioFlagA = checkSizeRatio(sizeA, realSizeRatio);
            boolean ratioFlagB = checkSizeRatio(sizeB, realSizeRatio);
            System.out.println("sizeA.width = [" + sizeA.width + "], sizeA.height = [" + sizeA.height + "]" + "sizeB.width = [" + sizeB.width + "], sizeB.height = [" + sizeB.height + "]");
            System.out.println("ratioFlagA = [" + ratioFlagA + "], ratioFlagB = [" + ratioFlagB + "]");
            if (ratioFlagA != ratioFlagB) {
                return ratioFlagA ? 1 : -1;
            }
            boolean flagA = sizeA.height < realSizeRatio;
            boolean flagB = sizeB.height < realSizeRatio;
            if (flagA || flagB) {
                return sizeA.height - sizeB.height;
            } else {
                return sizeB.height - sizeA.height;
            }
        });

        System.out.println("optimalSize.width = [" + optimalSize.width + "]" + "optimalSize.height = [" + optimalSize.height + "]");

//        Collections.sort(allFitPreviewSizes, (sizeA, sizeB) -> {
//            boolean ratioFlagA = checkSizeRatio(sizeA, realSizeRatio);
//            boolean ratioFlagB = checkSizeRatio(sizeB, realSizeRatio);
//            System.out.println("sizeA.width = [" + sizeA.width + "], sizeA.height = [" + sizeA.height + "]" + "sizeB.width = [" + sizeB.width + "], sizeB.height = [" + sizeB.height + "]");
//            System.out.println("ratioFlagA = [" + ratioFlagA + "], ratioFlagB = [" + ratioFlagB + "]");
//            if (ratioFlagA != ratioFlagB) {
//                return ratioFlagA ? 1 : -1;
//            }
//
//            return sizeB.height - sizeA.height;
//
//        });
//        for (Size size : allFitPreviewSizes) {
//            System.out.println("size.width = [" + size.width + "], size.height = [" + size.height + "]");
//        }
    }

    public static boolean checkSizeRatio(Size size, double targetRatio) {
        final double ASPECT_TOLERANCE = 0.05;
        double ratio = (double) size.width / size.height;
        return Math.abs(ratio - targetRatio) <= ASPECT_TOLERANCE;
    }

    /**
     * 相机图像尺寸类。
     */
    public static class Size {

        public int width;

        public int height;

        public Size(int w, int h) {
            this.width = w;
            this.height = h;
        }
    }
}
