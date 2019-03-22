package cn.codemao.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * <p>
 * 
 * </p>
 *
 * @author xiaozhi
 * @since 2019-03-22
 */
@ApiModel(value="User对象", description="")
class User : Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    var id: Long? = null
    var userName: String? = null
    var password: String? = null


    override fun toString(): String {
        return "User{" +
        "id=" + id +
        ", userName=" + userName +
        ", password=" + password +
        "}"
    }
}
