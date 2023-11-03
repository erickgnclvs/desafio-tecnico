/*
 * An XML document type.
 * Localname: getTiposDeSelo
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeSeloDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeSelo(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeSeloDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeSeloDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeSeloDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDESELO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeSelo");
    
    
    /**
     * Gets the "getTiposDeSelo" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeSelo getGetTiposDeSelo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeSelo target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeSelo)get_store().find_element_user(GETTIPOSDESELO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeSelo" element
     */
    public void setGetTiposDeSelo(br.jus.tjsc.www.selo.GetTiposDeSelo getTiposDeSelo)
    {
        generatedSetterHelperImpl(getTiposDeSelo, GETTIPOSDESELO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeSelo" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeSelo addNewGetTiposDeSelo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeSelo target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeSelo)get_store().add_element_user(GETTIPOSDESELO$0);
            return target;
        }
    }
}
