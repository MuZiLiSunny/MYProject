package com.wondersgroup.yly.SqlGenerator;//package com.wondersgroup.com.wondersgroup.yly.SqlGenerator;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.InjectionConfig;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.FileOutConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.TemplateConfig;
//import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
//import com.baomidou.mybatisplus.generator.config.po.TableInfo;
//import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//
///**
// * 
// * @author Zhangxiao
// * @createTime 2019年4月25日 下午2:52:59
// * @version 1.0
// * @describe :
// * 
// *           <pre>
// *           Mybatis-plus 代码生成器 官方文档: https://mp.baomidou.com/guide/generator.html
// *           </pre>
// *
// */
//public class MpGenerator {
//
//	public static void main(String[] args) {
//		runGenerator();
//	}
//
//	private static final String OUT_PUT_FILE = "C:\\\\Users\\\\86152\\\\Desktop\\\\generator";
//	private static final String LOCAL_TEMPLATE = "./ftl/generator";
//
//	// @Test
//	public static void runGenerator() {
//		System.err.println("generator start ... ");
//		AutoGenerator generator = new AutoGenerator();
//		// 使用默认模板: velocity
//		// generator.setTemplateEngine(new FreemarkerTemplateEngine());
//
//		// 全局配置
//		GlobalConfig globalConfig = new GlobalConfig();
//
//		// globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
//		globalConfig.setOutputDir(OUT_PUT_FILE);// 输出目录
//		globalConfig.setAuthor("Zhangxiao");// 作者
//		globalConfig.setOpen(false);
//		globalConfig.setFileOverride(false);// 是否覆盖同名文件，默认是false
//		globalConfig.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
//		globalConfig.setEnableCache(false);// XML 二级缓存
//		globalConfig.setBaseResultMap(true);// XML ResultMap
//		globalConfig.setBaseColumnList(false);// XML columList
//		/* 自定义文件命名，注意 %s 会自动填充表实体属性！ */
//		globalConfig.setMapperName("%sDao");
//		globalConfig.setXmlName("%sMapper");
//		globalConfig.setServiceName("%sService");
//		globalConfig.setServiceImplName("%sServiceImpl");
//		globalConfig.setControllerName("%sController");
//		generator.setGlobalConfig(globalConfig);
//
//		// 包配置
//		PackageConfig pc = new PackageConfig();
//		pc.setParent("com.wondersgroup.com.wondersgroup.yly");
//		pc.setEntity("model");
//		pc.setController("controller");
//		pc.setMapper("mappers");
//		pc.setService("api");
//		pc.setServiceImpl("service");
//		pc.setXml("mappers");
//
//		generator.setPackageInfo(pc);
//
//		// 配置数据源
//		DataSourceConfig dataSourceConfig = new DataSourceConfig();
//		dataSourceConfig.setDbType(DbType.MYSQL);
//		dataSourceConfig.setTypeConvert(new MySqlTypeConvert() {
//			// 自定义数据库表字段类型转换【可选】
//			@SuppressWarnings("unused")
//			public DbColumnType processTypeConvert(String fieldType) {
//				System.out.println("转换类型：" + fieldType);
//				// 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
//				return (DbColumnType) super.processTypeConvert(globalConfig, fieldType);
//			}
//		});
//		dataSourceConfig.setUrl(
//				"jdbc:mysql://localhost:3306/longhu?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=utf-8");
//		// dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
//		dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
//		dataSourceConfig.setUsername("root");
//		dataSourceConfig.setPassword("123456");
//		generator.setDataSource(dataSourceConfig);
//
//		// 策略配置
//		StrategyConfig strategy = new StrategyConfig();
//		strategy.setNaming(NamingStrategy.underline_to_camel);
//		strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//		strategy.setEntityLombokModel(true);
//		strategy.setRestControllerStyle(true);
//		strategy.setSuperEntityColumns("id");
//		strategy.setControllerMappingHyphenStyle(true);
//		strategy.setTablePrefix(pc.getModuleName() + "_");
//		strategy.setInclude(new String[] { "t_base_user", "t_base_department", "t_base_organization", "t_base_resource",
//				"t_base_resource_role", "t_base_role", "t_base_user_resource", "t_base_user_role" }); // 需要生成的表
//		generator.setStrategy(strategy);
//
//		// 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】 ${cfg.abc}
//		InjectionConfig cfg = new InjectionConfig() {
//			@Override
//			public void initMap() {
//				Map<String, Object> map = new HashMap<String, Object>();
//				map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
//				this.setMap(map);
//			}
//		};
//		// =====================================
//		// ==== !!! 模板内容,有时间再搞 !!! ====
//		// =====================================
//		// 自定义 xxListIndex.html 生成
//		List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
//		focList.add(new FileOutConfig(LOCAL_TEMPLATE + "/list.html.vm") {
//			@Override
//			public String outputFile(TableInfo tableInfo) {
//				// 自定义输入文件名称
//				return OUT_PUT_FILE + File.separator + tableInfo.getEntityName() + "ListIndex.html";
//			}
//		});
//		cfg.setFileOutConfigList(focList);
//		generator.setCfg(cfg);
//
//		// 自定义 xxAdd.html 生成
//		focList.add(new FileOutConfig(LOCAL_TEMPLATE + "/add.vm") {
//			@Override
//			public String outputFile(TableInfo tableInfo) {
//				// 自定义输入文件名称
//				return OUT_PUT_FILE + File.separator + tableInfo.getEntityName() + "Add.html";
//			}
//		});
//		cfg.setFileOutConfigList(focList);
//		generator.setCfg(cfg);
//
//		// 自定义 xxUpdate.html生成
//		/*
//		 * focList.add(new FileOutConfig(LOCAL_TEMPLATE + "/update.vm") {
//		 * 
//		 * @Override public String outputFile(TableInfo tableInfo) { // 自定义输入文件名称 return
//		 * OUT_PUT_FILE + File.separator + tableInfo.getEntityName() + "Update.html"; }
//		 * });
//		 */
//		cfg.setFileOutConfigList(focList);
//		generator.setCfg(cfg);
//
//		TemplateConfig tc = new TemplateConfig();
//		tc.setController(LOCAL_TEMPLATE + "/controller.vm");
//		tc.setService(LOCAL_TEMPLATE + "/service.vm");
//		tc.setServiceImpl(LOCAL_TEMPLATE + "/serviceImpl.vm");
//		tc.setEntity(LOCAL_TEMPLATE + "/entity.vm");
//		tc.setMapper(LOCAL_TEMPLATE + "/mappers.vm");
//		tc.setXml(LOCAL_TEMPLATE + "/mappers.xml.vm");
//		// 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
//		generator.setTemplate(tc);
//
//		generator.execute();
//		System.err.println("generator end ... ");
//
//	}
//
//}
