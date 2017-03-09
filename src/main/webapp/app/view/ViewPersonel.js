/*
 * File: app/view/ViewPersonel.js
 *
 * This file was generated by Sencha Architect version 4.1.1.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 6.2.x Classic library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 6.2.x Classic. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('XYZPro.view.ViewPersonel', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.viewPersonel',

    requires: [
        'XYZPro.view.ViewPersonelViewModel',
        'XYZPro.view.ViewPersonelViewController',
        'Ext.grid.Panel',
        'Ext.view.Table',
        'Ext.grid.column.Number',
        'Ext.grid.column.Boolean',
        'Ext.form.Panel',
        'Ext.form.field.Hidden',
        'Ext.form.field.Date',
        'Ext.form.field.ComboBox',
        'Ext.form.field.Checkbox',
        'Ext.toolbar.Toolbar',
        'Ext.button.Button'
    ],

    controller: 'viewpersonel',
    viewModel: {
        type: 'viewpersonel'
    },
    itemId: 'viewPersonel',
    maxHeight: 800,
    scrollable: true,
    title: '',

    layout: {
        type: 'vbox',
        align: 'stretch'
    },
    items: [
        {
            xtype: 'panel',
            flex: 0.75,
            height: 400,
            title: '',
            layout: {
                type: 'hbox',
                align: 'stretch'
            },
            items: [
                {
                    xtype: 'gridpanel',
                    flex: 1,
                    flex: 0.3,
                    itemId: 'gridKisiPanel',
                    title: 'Kişi Listesi',
                    autoLoad: true,
                    bind: {
                        store: '{kisiModels}'
                    },
                    listeners: {
                        select: 'onGridKisiPanelSelect',
                        rowdblclick: 'onGridKisiPanelRowDblClick'
                    },
                    columns: [
                        {
                            xtype: 'numbercolumn',
                            hidden: true,
                            dataIndex: 'id',
                            text: 'ID'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 200,
                            defaultWidth: 200,
                            dataIndex: 'ad',
                            text: 'Ad'
                        },
                        {
                            xtype: 'gridcolumn',
                            width: 200,
                            defaultWidth: 200,
                            dataIndex: 'soyad',
                            text: 'Soyad'
                        },
                        {
                            xtype: 'gridcolumn',
                            hidden: true,
                            dataIndex: 'dogum_tarihi',
                            text: 'Dogum Tarihi'
                        },
                        {
                            xtype: 'numbercolumn',
                            hidden: true,
                            dataIndex: 'cinsiyet',
                            text: 'Cinsiyet',
                            format: '00'
                        },
                        {
                            xtype: 'gridcolumn',
                            hidden: true,
                            dataIndex: 'medeniDurum',
                            text: 'Medeni Durum'
                        },
                        {
                            xtype: 'numbercolumn',
                            hidden: true,
                            dataIndex: 'unvanId',
                            text: 'Unvan Id',
                            format: '00'
                        },
                        {
                            xtype: 'gridcolumn',
                            hidden: true,
                            dataIndex: 'sicilNo',
                            text: 'Sicil No'
                        },
                        {
                            xtype: 'booleancolumn',
                            hidden: true,
                            dataIndex: 'aktif',
                            text: 'Aktif'
                        },
                        {
                            xtype: 'gridcolumn',
                            hidden: true,
                            dataIndex: 'dogumYeri',
                            text: 'Dogum Yeri'
                        },
                        {
                            xtype: 'gridcolumn',
                            hidden: true,
                            dataIndex: 'uyruk',
                            text: 'Uyruk'
                        },
                        {
                            xtype: 'gridcolumn',
                            hidden: true,
                            dataIndex: 'birimByBirimId',
                            text: 'Birim By Birim Id'
                        }
                    ]
                },
                {
                    xtype: 'form',
                    flex: 1,
                    flex: 0.5,
                    itemId: 'kisiBilgiFormPanel',
                    scrollable: true,
                    bodyPadding: 10,
                    title: 'Kişi Bilgileri',
                    items: [
                        {
                            xtype: 'hiddenfield',
                            anchor: '100%',
                            itemId: 'id',
                            fieldLabel: 'Label',
                            name: 'ID'
                        },
                        {
                            xtype: 'textfield',
                            anchor: '40%',
                            itemId: 'ad',
                            weight: 150,
                            fieldLabel: 'Adı',
                            name: 'ad',
                            allowBlank: false
                        },
                        {
                            xtype: 'textfield',
                            anchor: '40%',
                            itemId: 'soyad',
                            weight: 150,
                            fieldLabel: 'Soyadı',
                            name: 'soyad',
                            allowBlank: false
                        },
                        {
                            xtype: 'datefield',
                            anchor: '40%',
                            itemId: 'dogum_tarihi',
                            weight: 150,
                            fieldLabel: 'Doğum Tarihi',
                            name: 'dogum_tarihi',
                            allowBlank: false
                        },
                        {
                            xtype: 'textfield',
                            anchor: '40%',
                            itemId: 'dogum_yeri',
                            weight: 150,
                            fieldLabel: 'Doğum Yeri',
                            name: 'dogum_yeri',
                            allowBlank: false
                        },
                        {
                            xtype: 'combobox',
                            anchor: '40%',
                            itemId: 'cinsiyet',
                            weight: 150,
                            fieldLabel: 'Cinsiyet',
                            name: 'cinsiyet',
                            allowBlank: false,
                            displayField: 'aciklama',
                            queryMode: 'local',
                            store: 'lookUpCinsiyet',
                            valueField: 'id'
                        },
                        {
                            xtype: 'combobox',
                            anchor: '40%',
                            itemId: 'medeni_durum',
                            weight: 150,
                            fieldLabel: 'Medeni Durum',
                            name: 'medeni_durum',
                            displayField: 'aciklama',
                            queryMode: 'local',
                            store: 'lookUpMedeniDurum',
                            valueField: 'id'
                        },
                        {
                            xtype: 'combobox',
                            anchor: '40%',
                            itemId: 'unvan_id',
                            weight: 150,
                            fieldLabel: 'Ünvan',
                            name: 'unvan_id',
                            allowBlank: false,
                            displayField: 'aciklama',
                            queryMode: 'local',
                            store: 'lookUpUnvan',
                            valueField: 'id'
                        },
                        {
                            xtype: 'textfield',
                            anchor: '40%',
                            itemId: 'sicil_no',
                            weight: 150,
                            fieldLabel: 'Sicil No',
                            name: 'sicil_no'
                        },
                        {
                            xtype: 'combobox',
                            anchor: '40%',
                            itemId: 'uyruk',
                            weight: 150,
                            fieldLabel: 'Uyruk',
                            name: 'uyruk',
                            displayField: 'aciklama',
                            queryMode: 'local',
                            store: 'lookUpUyruk',
                            valueField: 'id'
                        },
                        {
                            xtype: 'combobox',
                            anchor: '40%',
                            itemId: 'birim_id',
                            weight: 150,
                            fieldLabel: 'Birim',
                            name: 'birim_id',
                            allowBlank: false,
                            displayField: 'birim_adi',
                            queryMode: 'local',
                            store: 'cmbBirimler',
                            valueField: 'id'
                        },
                        {
                            xtype: 'checkboxfield',
                            anchor: '100%',
                            itemId: 'aktif',
                            fieldLabel: 'Aktif',
                            name: 'aktif',
                            boxLabel: '',
                            inputValue: 'true'
                        }
                    ],
                    dockedItems: [
                        {
                            xtype: 'toolbar',
                            dock: 'bottom',
                            layout: {
                                type: 'hbox',
                                pack: 'center'
                            },
                            items: [
                                {
                                    xtype: 'button',
                                    formBind: true,
                                    itemId: 'btnKaydet',
                                    text: 'Kaydet',
                                    listeners: {
                                        click: 'onBtnKaydetClick'
                                    }
                                },
                                {
                                    xtype: 'button',
                                    itemId: 'btnTemizle',
                                    text: 'Temizle',
                                    listeners: {
                                        click: 'onBtnTemizleClick'
                                    }
                                }
                            ]
                        }
                    ]
                },
                {
                    xtype: 'gridpanel',
                    flex: 0.2,
                    height: 250,
                    itemId: 'gridAdresPanel',
                    width: 400,
                    title: 'Adres',
                    store: 'kisiAdres',
                    columns: [
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'adres_tipi',
                            text: 'Adres Tipi'
                        },
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'adres_detay1',
                            text: 'Adres Detay1'
                        },
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'adres_detay2',
                            text: 'Adres Detay2'
                        },
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'il',
                            text: 'Il'
                        },
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'ilce',
                            text: 'Ilce'
                        },
                        {
                            xtype: 'numbercolumn',
                            hidden: true,
                            dataIndex: 'id',
                            text: 'ID',
                            format: '00'
                        },
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'ic_kapi_no',
                            text: 'Ic Kapi No'
                        },
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'dis_kapi_no',
                            text: 'Dis Kapi No'
                        }
                    ],
                    dockedItems: [
                        {
                            xtype: 'toolbar',
                            dock: 'top',
                            items: [
                                {
                                    xtype: 'button',
                                    itemId: 'btnAdresEkle',
                                    text: 'Ekle/Düzelt',
                                    listeners: {
                                        click: 'onBtnAdresEkleClick'
                                    }
                                },
                                {
                                    xtype: 'button',
                                    itemId: 'btnAdresSil',
                                    text: 'Sil',
                                    listeners: {
                                        click: 'onBtnAdresSilClick'
                                    }
                                }
                            ]
                        }
                    ]
                }
            ]
        },
        {
            xtype: 'form',
            flex: 1,
            flex: 0.25,
            itemId: 'aramaFormPanel',
            scrollable: true,
            layout: 'column',
            bodyPadding: 10,
            title: 'Arama',
            items: [
                {
                    xtype: 'textfield',
                    anchor: '%40',
                    itemId: 'txtAd',
                    fieldLabel: 'Ad'
                },
                {
                    xtype: 'textfield',
                    anchor: '40%',
                    itemId: 'txtSoyad',
                    fieldLabel: 'Soyad'
                },
                {
                    xtype: 'combobox',
                    anchor: '40%',
                    itemId: 'cmbBirim',
                    fieldLabel: 'Birim',
                    displayField: 'birim_adi',
                    queryMode: 'local',
                    store: 'cmbBirimler',
                    valueField: 'id'
                }
            ],
            dockedItems: [
                {
                    xtype: 'toolbar',
                    dock: 'bottom',
                    layout: {
                        type: 'hbox',
                        pack: 'center'
                    },
                    items: [
                        {
                            xtype: 'button',
                            itemId: 'btnAra',
                            text: 'Ara',
                            listeners: {
                                click: 'onBtnAraClick'
                            }
                        },
                        {
                            xtype: 'button',
                            itemId: 'btnTemizle',
                            text: 'Temizle',
                            listeners: {
                                click: 'onBtnTemizleClick'
                            }
                        }
                    ]
                }
            ]
        }
    ],
    listeners: {
        afterrender: 'onViewPersonelAfterRender'
    }

});