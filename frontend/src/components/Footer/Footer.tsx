import React, { FC, ReactElement } from "react";
import { FacebookOutlined, LinkedinOutlined, TwitterOutlined } from "@ant-design/icons";
import { Col, Row, Typography } from "antd";

import "./Footer.scss";

const Footer: FC = (): ReactElement => {
    return (
        <div className={"footer-wrapper"}>
            <Row >
                <Col span={12}>
                    <Typography.Title level={3}>Perfume</Typography.Title>
                    <Typography.Text>(91) 932584133</Typography.Text>
                    <Typography.Text className={"mt-12"}>From 08:00 to 20:00 without breaks and weekends</Typography.Text>
                </Col>
                <Col span={12} >
                    <div className={"footer-wrapper-social"}>
                        <Typography.Title level={3}>Social networks</Typography.Title>
                        <a href="https://www.linkedin.com/in/renish-jagani-2b4758130/">
                            <LinkedinOutlined />
                        </a>
                    </div>
                </Col>
            </Row>
        </div>
    );
};

export default Footer;
