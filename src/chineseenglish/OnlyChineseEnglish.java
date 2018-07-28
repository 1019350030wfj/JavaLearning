package chineseenglish;

import java.util.regex.Pattern;

public class OnlyChineseEnglish {

    public static void main(String[] args) {
        String content = "123abc;合理；";
        char[] chars = content.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (isChineseByREG(String.valueOf(chars[i])) || isEnglishByREG(chars[i])){
                builder.append(chars[i]);
            }
        }
        System.out.println("过滤完 = [" + builder.toString() + "]");
    }

    /**
     * 根据Unicode编码判断中文汉字和中文符号
     *
     * @param c
     * @return
     */
    public static boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if(ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
                || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
            return true;
        }
        return false;
    }

    /**
     * 根据正则表达式判断部分CJK字符（CJK统一汉字）
     *
     * @param str
     * @return
     */
    public static boolean isChineseByREG(String str) {
//        if(TextUtils.isEmpty(str)) return false;
        Pattern pattern = Pattern.compile("[\\u4E00-\\u9FBF]+");
        return pattern.matcher(str.trim()).find();
    }

    public static boolean isEnglishByREG(char c) {
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ) {
            return true;
        }

        return false;
    }
}
