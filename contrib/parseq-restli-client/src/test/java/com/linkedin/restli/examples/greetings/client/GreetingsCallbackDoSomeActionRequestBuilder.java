
package com.linkedin.restli.examples.greetings.client;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.examples.greetings.api.Greeting;
import com.linkedin.restli.examples.groups.api.TransferOwnershipRequest;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Thu Mar 31 14:16:22 PDT 2016")
public class GreetingsCallbackDoSomeActionRequestBuilder
    extends ActionRequestBuilderBase<Long, Greeting, GreetingsCallbackDoSomeActionRequestBuilder>
{


    public GreetingsCallbackDoSomeActionRequestBuilder(java.lang.String baseUriTemplate, Class<Greeting> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("someAction");
    }

    public GreetingsCallbackDoSomeActionRequestBuilder aParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("someAction").getFieldDef("a"), value);
        return this;
    }

    public GreetingsCallbackDoSomeActionRequestBuilder bParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("someAction").getFieldDef("b"), value);
        return this;
    }

    public GreetingsCallbackDoSomeActionRequestBuilder cParam(TransferOwnershipRequest value) {
        super.setParam(_resourceSpec.getRequestMetadata("someAction").getFieldDef("c"), value);
        return this;
    }

    public GreetingsCallbackDoSomeActionRequestBuilder dParam(TransferOwnershipRequest value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("someAction").getFieldDef("d"), value);
        return this;
    }

    public GreetingsCallbackDoSomeActionRequestBuilder eParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("someAction").getFieldDef("e"), value);
        return this;
    }

}
