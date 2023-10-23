/*
 * An XML document type.
 * Localname: getMoedas
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetMoedasDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getMoedas(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetMoedasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetMoedasDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMoedasDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMOEDAS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMoedas");
    
    
    /**
     * Gets the "getMoedas" element
     */
    public br.jus.tjsc.www.selo.GetMoedas getGetMoedas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMoedas target = null;
            target = (br.jus.tjsc.www.selo.GetMoedas)get_store().find_element_user(GETMOEDAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMoedas" element
     */
    public void setGetMoedas(br.jus.tjsc.www.selo.GetMoedas getMoedas)
    {
        generatedSetterHelperImpl(getMoedas, GETMOEDAS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getMoedas" element
     */
    public br.jus.tjsc.www.selo.GetMoedas addNewGetMoedas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMoedas target = null;
            target = (br.jus.tjsc.www.selo.GetMoedas)get_store().add_element_user(GETMOEDAS$0);
            return target;
        }
    }
}
