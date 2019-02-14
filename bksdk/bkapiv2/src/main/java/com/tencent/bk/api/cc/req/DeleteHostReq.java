package com.tencent.bk.api.cc.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tencent.bk.api.protocol.ApiReq;
import lombok.Getter;
import lombok.Setter;

/**
 * {
 *     "bk_app_code": "esb_test",
 *     "bk_app_secret": "xxx",
 *     "bk_token": "xxx",
 *     "bk_supplier_id": 0,
 *     "bk_host_id": "1,2,3",
 * }
 */
@Getter
@Setter
public class DeleteHostReq extends ApiReq {
    /**
     * 开发商ID CompanyId
     */
    @JsonProperty("bk_supplier_id")
    private int bkSupplierId;
    /**
     * 主机id，多个以逗号分隔
     */
    @JsonProperty("bk_host_id")
    private String bkHostIds;
}
