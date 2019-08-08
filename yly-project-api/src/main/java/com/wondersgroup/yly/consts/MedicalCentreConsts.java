package com.wondersgroup.yly.consts;

/**
 * @author Li Jinsen
 * @Title: MedicalCentreConsts
 * @ProjectName com.wondersgroup.yly-medical
 * @Description: 医疗中心--自定义常量类
 * @date 2019/5/15 18:08
 */
public final class MedicalCentreConsts {

    private MedicalCentreConsts() {
    }

    /**
     * 删除状态,默认状态,未删除
     * {
     * 0：未删除
     * 1：删除
     * }
     */
    public static final Integer REMOVE_STATUS_NO = 0;
    public static final Integer REMOVE_STATUS_YES = 1;

    /**
     * 优惠方式，默认是0：无优惠
     */
    public static final Long DISCOUNT_TYPE_NONE = 0L;

    /**
     * 病程记录部分：记录状态
     * {
     * 1：暂存
     * 2：提交
     * 3：作废
     * }
     */
    public static final Integer RECORD_STATUS_STORAGE = 1;
    public static final Integer RECORD_STATUS_COMMIT = 2;
    public static final Integer RECORD_STATUS_CANCEL = 3;

    /**
     * 病程记录部分：记录编号
     * {
     *     1：日常病程记录
     *     2：阶段小结
     *     3：会诊记录
     *     4：抢救记录
     *     5：转诊记录
     *     6：离院记录
     *     7：死亡记录
     * }
     **/
    public static final Integer RECORD_CONDITION = 1;
    public static final Integer RECORD_SUMMARY = 2;
    public static final Integer RECORD_CONSULTATION = 3;
    public static final Integer RECORD_RESCUE= 4;
    public static final Integer RECORD_REFERRAL = 5;
    public static final Integer RECORD_LEAVING = 6;
    public static final Integer RECORD_DEATH = 7;

    /**
     * 乐观锁状态：0
     */
    public static final Integer Revision_ZERO = 0;

    /**
     * 就诊记录详情分类 ：1-住院 2-急诊 3-门诊
     */
    public static final Integer TREATMENT_TYPE1 = 1;
    public static final Integer TREATMENT_TYPE2 = 2;
    public static final Integer TREATMENT_TYPE3 = 3;
}
